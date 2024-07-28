import styles from './input.module.scss'

export default function Input({label, value, type='text',name,onChange,isTextArea=false,isDisabled=false, placeholder='',max,min}) {
    return (
        <div className={styles.inputContainer}>
            <label className={styles.label}>{label}</label>
            {!isTextArea ?
               ( <input name={name} type={type} onChange={onChange} value={value} disabled={isDisabled} placeholder={placeholder} max={max} min={min}/>) : 
               (<textarea name={name} type={type} onChange={onChange} value={value} placeholder={placeholder}></textarea>)}
        </div>
    )
   

    
}