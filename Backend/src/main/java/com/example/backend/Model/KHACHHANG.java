package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "KHACHHANG")
public class KHACHHANG {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAKH;
    private String CMND;
    private String HO;
    private String TEN;
    private String DIACHI;
    private Date NGAYSINH;
    private String SODIENTHOAI;
    private String EMAIL;
    private String TENDANGNHAP;

    public KHACHHANG(int MAKH, String CMND, String HO, String TEN, String DIACHI, Date NGAYSINH, String SODIENTHOAI, String EMAIL, String TENDANGNHAP) {
        this.MAKH = MAKH;
        this.CMND = CMND;
        this.HO = HO;
        this.TEN = TEN;
        this.DIACHI = DIACHI;
        this.NGAYSINH = NGAYSINH;
        this.SODIENTHOAI = SODIENTHOAI;
        this.EMAIL = EMAIL;
        this.TENDANGNHAP = TENDANGNHAP;
    }

    public KHACHHANG() {
    }
}
