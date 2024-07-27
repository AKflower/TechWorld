import styles from "./productDetail.module.scss";
import Navbar from "../../components/navbar/navbar";

export default function ProductDetail () {
    return (
       
        <div className={styles.container}>
            <Navbar />
            <div className={styles.productDetail}>
                <div className={styles.image}>
                
                </div>
                <div  className={styles.content}>
                    <h2>Galaxy Samsung</h2>
                    <p className={styles.description}></p>
                </div>
            </div>
        </div>
    )
}