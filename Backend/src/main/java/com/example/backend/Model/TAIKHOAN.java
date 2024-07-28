package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
@Entity
@Table(name = "TAIKHOAN")
public class TAIKHOAN {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private String TENDANGNHAP;
    private String MATKHAU;
    private String TRANGTHAI;
    private int MAQUYEN;

    @OneToOne(mappedBy = "TAIKHOAN", cascade = CascadeType.ALL)
    private NHANVIEN nhanVien;

    @OneToOne(mappedBy = "TAIKHOAN", cascade = CascadeType.ALL)
    private KHACHHANG khachHang;

    public TAIKHOAN(String TENDANGNHAP, String MATKHAU, String TRANGTHAI, int MAQUYEN) {
        this.TENDANGNHAP = TENDANGNHAP;
        this.MATKHAU = MATKHAU;
        this.TRANGTHAI = TRANGTHAI;
        this.MAQUYEN = MAQUYEN;
    }

    public TAIKHOAN() {
    }
}