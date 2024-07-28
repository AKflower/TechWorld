import styles from "./productDetail.module.scss";
import Navbar from "../../components/navbar/navbar";
import product from '../../assets/images/product.png'
import Input from "../../components/input/input";
import Button from "../../components/button/button";
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import Footer from "../../components/footer/footer";

export default function ProductDetail() {
    return (

        <div className={styles.container}>
            <Navbar />
            <div className={styles.main}>

                <div className={styles.header}>Điện thoại</div>
                <div className={styles.productDetail}>
                    <div className={styles.image} style={{ backgroundImage: `url(${product})` }}>

                    </div>
                    <div className={styles.content} >
                        <h2>Galaxy Samsung</h2>
                        <p className={styles.description}>
                            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                        </p>
                        <p>7.000.0000</p>
                        <div className="d-flex" style={{ alignItems: 'center', gap: '1em' }}>
                            <div style={{ width: '4em' }}>
                                <Input type={'number'} value={'1'} min={'1'} />
                            </div>
                            <div style={{ width: '10em', marginTop: '0.5em' }}>
                                <Button name={'Thêm vào giỏ hàng'} color="#4977F7" />
                            </div>
                        </div>
                    </div>
                </div>
                <div className={styles.header}>Đánh giá</div>
                <div className={styles.comment}>
                    <Input isTextArea />
                    <div className={styles.btn}>
                        <div style={{ width: '5em', float: 'right' }}><Button name={'Gửi'} /></div>
                    </div>
                </div>
                <div className={styles.commentList}>
                    <div className={styles.commentItem}>
                        <div className={styles.infor}>
                            <AccountCircleIcon /> Phạm Thanh Toàn
                        </div>
                        <div className={styles.content}>
                            <p>Không tốt</p>
                        </div>

                    </div>
                    <div className={styles.commentItem}>
                        <div className={styles.infor}>
                            <AccountCircleIcon /> Phạm Thanh Toàn
                        </div>
                        <div className={styles.content}>
                            <p>Không tốt</p>
                        </div>

                    </div>
                    <div className={styles.commentItem}>
                        <div className={styles.infor}>
                            <AccountCircleIcon /> Phạm Thanh Toàn
                        </div>
                        <div className={styles.content}>
                            <p>Không tốt</p>
                        </div>

                    </div>

                </div>
            </div>
            <Footer />
        </div>
    )
}