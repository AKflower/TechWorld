import styles from './button2.module.scss'

export default function Button2 ({name,color,onClick}) {
    return (
        <button className={styles.btn} style={{background:color}} onClick={onClick}>
        {name}
        </button>
     )
}