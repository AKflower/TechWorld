import styles from './hotsale.module.scss'
import Product from '../product/product'

export default function HotSale() {
    return (
        <div className={styles.container}>
            <Product />
        </div>
    )
}