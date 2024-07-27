package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "PHIEUNHAP")
public class PHIEUNHAP {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAPN;
    private Date NGAYNHAP;
    private int MANV;
    private int MADDH;

    public PHIEUNHAP(int MAPN, Date NGAYNHAP, int MANV, int MADDH) {
        this.MAPN = MAPN;
        this.NGAYNHAP = NGAYNHAP;
        this.MANV = MANV;
        this.MADDH = MADDH;
    }

    public PHIEUNHAP() {
    }
}