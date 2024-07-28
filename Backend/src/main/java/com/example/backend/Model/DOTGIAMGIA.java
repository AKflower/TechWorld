package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "DOTGIAMGIA")
public class DOTGIAMGIA {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MADGG;
    private Date NGAYBATDAU;
    private Date NGAYKETTHUC;
    private String MOTA;
    private int MANV;

    public DOTGIAMGIA(int MADGG, Date NGAYBATDAU, Date NGAYKETTHUC, String MOTA, int MANV) {
        this.MADGG = MADGG;
        this.NGAYBATDAU = NGAYBATDAU;
        this.NGAYKETTHUC = NGAYKETTHUC;
        this.MOTA = MOTA;
        this.MANV = MANV;
    }

    public DOTGIAMGIA() {
    }
}