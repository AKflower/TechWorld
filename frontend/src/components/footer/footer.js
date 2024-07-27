import styles from './footer.module.scss'
import FacebookIcon from '@mui/icons-material/Facebook';
import InstagramIcon from '@mui/icons-material/Instagram';
import YouTubeIcon from '@mui/icons-material/YouTube';
import SupportAgentIcon from '@mui/icons-material/SupportAgent';
import LocalShippingIcon from '@mui/icons-material/LocalShipping';
import DiscountIcon from '@mui/icons-material/Discount';

export default function Footer () {
    return (
        <div className={styles.container}>
            <div className='d-flex center f-col' style={{borderBottom:'.5px solid white',padding:'1em'}}>
                <h3>TECHWORLD</h3>
                <div>
                    <FacebookIcon />
                    <InstagramIcon />
                    <YouTubeIcon />
                </div>
            </div>
            <div className={styles.infor}>
                <div className={styles.inforItem}>
                    <SupportAgentIcon />
                    <span>+84 123 456 789</span>
                </div>
         

                <div className={styles.inforItem}>
                    <LocalShippingIcon />
                    <span>Miễn phí vận chuyển</span>
                </div>

  
            <div className={styles.inforItem}>
                <DiscountIcon />
                <span>Ưu đãi bất ngờ</span>
            </div>
            </div>
            <p>&copy; <span >2024</span> TechWorld. All rights reserved.</p>
        </div>
    )
}