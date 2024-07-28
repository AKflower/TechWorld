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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MATAIKHOAN;
    private String TENDANGNHAP;
    private String MATKHAU;
    private String TRANGTHAI;
    private int MAQUYEN;

    public TAIKHOAN(int MATAIKHOAN,String TENDANGNHAP, String MATKHAU, String TRANGTHAI, int MAQUYEN) {
        this.MATAIKHOAN = MATAIKHOAN;
        this.TENDANGNHAP = TENDANGNHAP;
        this.MATKHAU = MATKHAU;
        this.TRANGTHAI = TRANGTHAI;
        this.MAQUYEN = MAQUYEN;
    }

    public TAIKHOAN() {
    }
}