import styles from './ptitle.module.scss'

export default function Ptitle ({title,content}) {
    return (
        <p>
            <span className={styles.title}>{title}: </span>
            <span>{content}</span>
        </p>
    )
}