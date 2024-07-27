import styles from './home.module.scss'
import Header from '../../components/header/header'
import HotSale from '../../components/hotsale/hotsale'

export default function Home () {
    return (
        <div className={styles.container}>
            <Header />
            <HotSale />
        </div>
    )
}