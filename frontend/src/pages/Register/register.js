import styles from './register.module.scss'
import Input from '../../components/input/input'
import Button from '../../components/button/button'
import { useState } from 'react';
import { ToastContainer, toast } from 'react-toastify';

import {useNavigate} from 'react-router-dom';
import accountService from '../../services/accountService';




export default function Register () {
    const [isLoading,setIsLoading] = useState(false)
    const [formData, setFormData] = useState({
        name: '',
        username: '',
        email: '',
        password: '',
        reTypePassword: '',
        identifier: '',
      });
      const navigate = useNavigate()
    
      const handleChange = (e) => {
        console.log(e.target);
        const { name, value } = e.target;
        setFormData((prevData) => ({
          ...prevData,
          [name]: value
        }));
        console.log(formData)
      };
    
      const handleSubmit = async (e) => {
        console.log('test');
        e.preventDefault();
        setIsLoading(true);
        for (const field in formData) {
            if (formData[field].trim() === '') {
              toast.error(`Vui lòng không để trống bất kì thông tin nào!`);
              return;
            }
          }
        if (formData.password!=formData.reTypePassword) {
            toast.error('Mật khẩu không trùng khớp nhau!');
            setFormData((prevData) => ({
                ...prevData,
                reTypePassword: ''
              }));
              return;
        }
        try {
          
          const response = await accountService.insertUser(
            formData.name,
            formData.username,
            formData.email,
            formData.password,
            formData.identifier,

          );
          console.log('User registered:', response);

          setFormData(() => ({
            username: '',
            name: '',
            password:'',
            email: '',
            reTypePassword: ''
          }));
          toast.success('Đăng ký thành công!');
          setTimeout(function () {
            navigate(`/login`)
          },1000)
        } catch (err) {
          console.error('Registration error:', err.message);
          setIsLoading(false);
        }
      };
      
    return (
        
        <div className={styles.container}>
            
            <form>
                    <Input label={'Họ và tên'} name="name" value={formData.name} onChange={handleChange}/>
                    <Input label={'CMND'} name="identifier" value={formData.identifier} onChange={handleChange}/>
                    <Input label={'Tên đăng nhập'} name="username" value={formData.username} onChange={handleChange}/>
                    <Input label={'Email'} type={'email'} name="email" value={formData.email} onChange={handleChange}/>
                    <Input label={'Mật khẩu'} type={'password'} name="password" value={formData.password} onChange={handleChange}/>
                    <Input label={'Xác nhận mật khẩu'} type={'password'} name="reTypePassword" value={formData.reTypePassword} onChange={handleChange}/>
                    <Button name={'Đăng ký'} onClick={handleSubmit} disabled={isLoading}></Button>
                    
            </form>
           
        </div>
    )
}