package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
@Entity
@Table(name = "SANPHAM")
public class SANPHAM {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MASP;
    private String TENSANPHAM;
    private String MOTA;
    private String THONGSOKYTHUAT;
    private String HINHANH;
    private int SOLUONGTON;
    private Double GIAHIENTAI;
    private int LUOTMUA;
    private String TRANGTHAI;
    private int MALOAISP;

    public SANPHAM(int MASP, String TENSANPHAM, String MOTA, String THONGSOKYTHUAT, String HINHANH, int SOLUONGTON, Double GIAHIENTAI, int LUOTMUA, String TRANGTHAI, int MALOAISP) {
        this.MASP = MASP;
        this.TENSANPHAM = TENSANPHAM;
        this.MOTA = MOTA;
        this.THONGSOKYTHUAT = THONGSOKYTHUAT;
        this.HINHANH = HINHANH;
        this.SOLUONGTON = SOLUONGTON;
        this.GIAHIENTAI = GIAHIENTAI;
        this.LUOTMUA = LUOTMUA;
        this.TRANGTHAI = TRANGTHAI;
        this.MALOAISP = MALOAISP;
    }

    public SANPHAM() {
    }
}