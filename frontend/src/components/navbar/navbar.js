import styles from './navbar.module.scss'
import Button from '../button/button'
import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import { useNavigate,useLocation, Link} from 'react-router-dom';


export default function Navbar () {
    const location = useLocation();
    const path = location.pathname;
    return (
        <div className={styles.container}>
            <div className={styles.logo}>
                TechWorld
            </div>
            <div className={styles.tabContainer}>
                <Link to={'/home'} >
                <div className={path=='/home' ? styles.tabActive : styles.tab}>
                Trang chủ
            </div>
                </Link>
                <Link to={'/product'} >
                <div className={path=='/product' ? styles.tabActive : styles.tab}>
                    Sản phẩm
                </div>
                </Link>
                <Link to={'/about'}>
                    <div className={path=='/about' ? styles.tabActive : styles.tab}>
                    Giới thiệu
                </div>
                </Link>
              
            </div>
            <div style={{width:'6em',marginLeft:'auto'}}>
                <Button name={'Đăng nhập'} color='silver'/>
                {0!=0 && <AddShoppingCartIcon />}
            </div>
        </div>
    )
}