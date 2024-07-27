import styles from './home.module.scss'
import Header from '../../components/header/header'
import HotSale from '../../components/hotsale/hotsale'
import Product from '../../components/product/product'
import Footer from '../../components/footer/footer'

export default function Home () {
    return (
        <div className={styles.container}>
            <Header />
            <HotSale />
            <div className={styles.session}>
                <h3 className={styles.title}>Điện thoại</h3>
                <div className={styles.listProduct}>
                    <Product />
                    <Product />
                    <Product />
                    <Product />

                </div>
            </div>
             <div className={styles.session}>
                <h3 className={styles.title}>Máy tính</h3>
                <div className={styles.listProduct}>
                    <Product />
                    <Product />
                    <Product />
                    <Product />

                </div>
            </div>
            <div className={styles.session}>
            <h3 className={styles.title}>Phụ kiện</h3>
            <div className={styles.listProduct}>
                <Product />
                <Product />
                <Product />
                <Product />

            </div>
        </div>
        <Footer />
        </div>
    )
}