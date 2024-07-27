import styles from './product.module.scss'
import product from '../../assets/images/product.png'

export default function Product () {
    return (
        <div className={styles.container}>
            <img src={product} />
            <div className={styles.content}>
                <h2>Samsung Galaxy</h2>
                <h3>Price</h3>
               
            </div>
            <div className={styles.addCart}>
                Thêm vào giỏ hàng
            </div>
        </div>

    )
}