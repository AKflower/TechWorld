import styles from './header.module.scss'
import Navbar from '../navbar/navbar'

export default function Header ( ) {
    return (
        <div className={styles.container}>
            <Navbar />
        </div>
    )
}