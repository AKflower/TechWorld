package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "DONDATHANG")
public class DONDATHANG {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MADDH;
    private Date NGAYDATHANG;
    private int MANCC;
    private int MANV;
    private boolean TRANGTHAI;

    public DONDATHANG(int MADDH, Date NGAYDATHANG, int MANCC, int MANV, boolean TRANGTHAI) {
        this.MADDH = MADDH;
        this.NGAYDATHANG = NGAYDATHANG;
        this.MANCC = MANCC;
        this.MANV = MANV;
        this.TRANGTHAI = TRANGTHAI;
    }

    public DONDATHANG() {
    }
}