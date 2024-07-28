import styles from './login.module.scss'
// import Brand from '../../components/brand/brand'
import Input from '../../components/input/input';
// import Button from '../../components/button/button'
import Button from '../../components/button/button';
import { Link } from 'react-router-dom';
import { useState ,useEffect} from 'react';
// import authService from '../../services/authService';
import { toast } from 'react-toastify';
import { useNavigate } from 'react-router-dom';
import accountService from '../../services/accountService';

export default function Login () {
    const navigate = useNavigate()
    const [isLoading,setIsLoading] = useState(false)
    useEffect(() => {
     
    },[])
   
    const [formData, setFormData] = useState({
        username: '',
        password: ''
      });
      const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData((prevData) => ({
          ...prevData,
          [name]: value
        }));
      };
    
      const handleSubmit = async (e) => {
        e.preventDefault();
        setIsLoading(true);
    
        try {
          const response = await accountService.getUserInfo(formData.username);
          
          if (response.password == formData.password) localStorage.setItem('user',response);
          
        
        //   localStorage.setItem('id',data.employee_id)
    
          // Hiển thị thông báo thành công
          // if (response.maquyen==7) 
          navigate('/home')
        } catch (error) {
          console.error('Login error:', error.message);
          setIsLoading(false);
        } finally {
          setIsLoading(false);
        }
      };
    return (
        
        <div className={styles.container}>
          
            <form>
                    <Input label={'Tên đăng nhập'} name={'username'} value={formData.username} onChange={handleChange}/>
                    <Input label={'Mật khẩu'} type={'password'} name={'password'} value={formData.password} onChange={handleChange}/>
                    <Button name={'Đăng nhập'} disabled={isLoading} onClick={handleSubmit}></Button>
                    <div className={styles.footerLogin}>
                        <Link to="/register">Đăng ký</Link>
                        <Link to="/forgot">Quên mật khẩu</Link>
                        
                    </div>
            </form>
           
        </div>
    )
}