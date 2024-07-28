import styles from './cart.module.scss'
import Navbar from '../../components/navbar/navbar'
import Footer from '../../components/footer/footer'
import Input from '../../components/input/input'
import Button from '../../components/button/button'
import { useEffect, useState } from 'react';
import Ptitle from '../../components/ptitle/ptitle';

export default function Cart() {
    return (
        <div className={styles.container}>
            <Navbar />
            <div className={styles.main}>
                <div className={styles.header}>Giỏ hàng</div>
                <table>
                    <thead>
                        <tr>
                            <th></th>
                            <th>Sản phẩm</th>
                            <th>Giá</th>
                            <th>Số lượng</th>
                            <th>Tạm tính</th>
                        </tr>

                    </thead>
                    <tbody>
                        <tr>
                            <td>X</td>
                            <td>Samsung Galaxy</td>
                            <td>5000000</td>
                            <td>  <div style={{ width: '4em' }}>
                                <Input type={'number'} value={'1'} min={'1'} />
                            </div></td>
                            <td>15000000</td>

                        </tr>
                        <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>  </td>
                        <td> <Ptitle title={'Phí vận chuyển'} content={'15000'} /></td>
                       
                        </tr>
                        <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>  </td>
                        <td> <div className={styles.result}>
                        <Ptitle title={'Tổng tiền'} content={'150000000'} />
                        <div style={{width:'8em'}}><Button name={'Thanh toán'} color='#4977F7'/></div>
                    </div></td>
                       
                        </tr>
                    </tbody>
                </table>
               
                

            </div>
            <Footer />
        </div>
    )
}