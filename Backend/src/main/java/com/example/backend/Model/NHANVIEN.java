package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "NHANVIEN")
public class NHANVIEN {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MANV;
    private String CMND;
    private String HO;
    private String TEN;
    private Date NGAYSINH;
    private String SODIENTHOAI;
    private String EMAIL;
    private String TENDANGNHAP;

    @OneToOne
    @JoinColumn(name = "TENDANGNHAP", referencedColumnName = "TENDANGNHAP")
    private TAIKHOAN taiKhoan;

    public NHANVIEN(int MANV, String CMND, String HO, String TEN, Date NGAYSINH, String SODIENTHOAI, String EMAIL, String TENDANGNHAP) {
        this.MANV = MANV;
        this.CMND = CMND;
        this.HO = HO;
        this.TEN = TEN;
        this.NGAYSINH = NGAYSINH;
        this.SODIENTHOAI = SODIENTHOAI;
        this.EMAIL = EMAIL;
        this.TENDANGNHAP = TENDANGNHAP;
    }

    public NHANVIEN() {
    }
}