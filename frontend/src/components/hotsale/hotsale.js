import styles from './hotsale.module.scss'
import Product from '../product/product'

export default function HotSale() {
    return (
        <div className={styles.container}>
            <div style={{width:'90%',backgroundColor: 'black',padding:'1em',borderRadius:'10px', position: 'relative'}}>
                <div className={styles.header}><h2> Hot Sale</h2></div>
                <div className={styles.productList}>
                    <Product />
                    <Product />
                    <Product />
                    <Product />
                    <Product />
                </div>
            </div>
          
           
        </div>
    )
}