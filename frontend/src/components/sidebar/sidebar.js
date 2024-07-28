import styles from './sidebar.module.scss';
import { Link } from 'react-router-dom';
import {useLocation } from 'react-router-dom'
import PersonOutlineIcon from '@mui/icons-material/PersonOutline';
import OtherHousesOutlinedIcon from '@mui/icons-material/OtherHousesOutlined';
import AssignmentIndOutlinedIcon from '@mui/icons-material/AssignmentIndOutlined';
import CalendarMonthOutlinedIcon from '@mui/icons-material/CalendarMonthOutlined';
import LocalHospitalIcon from '@mui/icons-material/LocalHospital';
import ApartmentIcon from '@mui/icons-material/Apartment';
import EventAvailableIcon from '@mui/icons-material/EventAvailable';
import DashboardIcon from '@mui/icons-material/Dashboard';
import StorefrontIcon from '@mui/icons-material/Storefront';
import BrunchDiningIcon from '@mui/icons-material/BrunchDining';
import TheatersIcon from '@mui/icons-material/Theaters';
import ForumIcon from '@mui/icons-material/Forum';
import CollectionsIcon from '@mui/icons-material/Collections';
import {useNavigate} from 'react-router-dom'
import InventoryIcon from '@mui/icons-material/Inventory';
import DevicesIcon from '@mui/icons-material/Devices';
import YoutubeSearchedForIcon from '@mui/icons-material/YoutubeSearchedFor';
export default function Sidebar () {
    const navigate= useNavigate()
    const token = localStorage.getItem('token')
    const path= useLocation().pathname; 
    
    if (!token && path!='/admin') navigate('/admin'); 
    return (
        <div className={ styles.container} style={{display:(path.includes('/admin') )?  'block' : 'none'}} >
            <div style={{padding:'1em 0' ,fontWeight:'700',fontFamily:'Luckiest Guy',textAlign:'center',fontSize:'2em'}}>TechWorld</div>
            
            <Link to='/admin/dashboard'>
                <div className={styles.item} style={path.includes('/dashboard') ? {backgroundColor: 'rgb(157 192 0)',color:'white'} : {}}>
                   <DashboardIcon /><span>Thống kê</span>
                </div>
            </Link>
            <Link to='/admin/shop'>
                <div className={styles.item} style={path.includes('/shop') ? {backgroundColor: 'rgb(157 192 0)',color:'white'} : {}}>
                    <DevicesIcon /><span>Sản phẩm</span>
                </div>
            </Link>
           <Link to='/admin/food'>
                <div className={styles.item} style={path.includes('/food') ? {backgroundColor: 'rgb(157 192 0)',color:'white'} : {}}>
                    <InventoryIcon /><span>Đơn hàng</span>
                </div>
            </Link>
           <Link to='/admin/cinema'>
                <div className={styles.item} style={path.includes('/cinema') ? {backgroundColor: 'rgb(157 192 0)',color:'white'} : {}}>
                    <YoutubeSearchedForIcon /><span>Bảo hành</span>
                </div>
            </Link>
            {/*<Link to='/admin/feedback'>
            <div className={styles.item} style={path.includes('/feedback') ? {backgroundColor: 'rgb(157 192 0)',color:'white'} : {}}>
                <ForumIcon /><span>Nhân viên</span>
            </div>
        </Link>
          <Link to='/admin/gallery'>
            <div className={styles.item} style={path.includes('/gallery') ? {backgroundColor: 'rgb(157 192 0)',color:'white'} : {}}>
                <CollectionsIcon /><span>Gallery</span>
            </div>
    </Link>*/}
    
        
        </div>  

    )
}