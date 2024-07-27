import styles from './navbar.module.scss'

export default function Navbar () {

    return (
        <div className={styles.container}>
            <div className={styles.logo}>
                TechWorld
            </div>
            <div className={styles.tabContainer}>
                <div className={styles.tab}>
                    Trang chủ
                </div>
                <div className={styles.tab}>
                    Sản phẩm
                </div>
                <div className={styles.tab}>
                    Giới thiệu
                </div>
            </div>
        </div>
    )
}