import styles from './product.module.scss'
import product from '../../assets/images/product.png'
import {useNavigate} from 'react-router-dom'

export default function Product () {
    const navigate = useNavigate()
    const handleAddCart = () => {
        
    }
    return (
        <div className={styles.container} >
            <img src={product} onClick={() => navigate('/product/detail')}/>
            <div className={styles.content} onClick={() => navigate('/product/detail')}>
                <h2>Samsung Galaxy</h2>
                <h3>Price</h3>
               
            </div>
            <div className={styles.addCart} onClick={() => handleAddCart()}>
                Thêm vào giỏ hàng
            </div>
        </div>

    )
}