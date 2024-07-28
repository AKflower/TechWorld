import styles from './navbar.module.scss'
import Button from '../button/button'
import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import LogoutIcon from '@mui/icons-material/Logout';
import { useNavigate,useLocation, Link} from 'react-router-dom';


export default function Navbar () {
    const location = useLocation();
    const navigate = useNavigate()
    const user = localStorage.getItem('user')
   
    const path = location.pathname;
    return (
        <div className={styles.container}>
            <div className={styles.logo}>
                TechWorld
            </div>
            <div className={styles.tabContainer}>
                <Link to={'/home'} >
                <div className={path.includes('/home') ? styles.tabActive : styles.tab}>
                Trang chủ
            </div>
                </Link>
                <Link to={'/product'} >
                <div className={path.includes('/product') ? styles.tabActive : styles.tab}>
                    Sản phẩm
                </div>
                </Link>
                <Link to={'/about'}>
                    <div className={path.includes('/about') ? styles.tabActive : styles.tab}>
                    Giới thiệu
                </div>
                </Link>
              
            </div>
        <div style={{width:'6em',marginLeft:'auto'}}>
               {!user ? <Button name={'Đăng nhập'} color='silver' onClick={() => navigate('/login')} />
                 :
                 <div className='d-flex' style={{justifyContent:'space-around'}}> 
                 <span style={{cursor:'pointer'}}><AddShoppingCartIcon /> </span>
                 <span style={{cursor:'pointer'}} onClick={() => {
                    localStorage.removeItem('user')
                    navigate('/home')
                 }}><LogoutIcon /></span>
                 </div>
                }
            </div>
           
        </div>
    )
}