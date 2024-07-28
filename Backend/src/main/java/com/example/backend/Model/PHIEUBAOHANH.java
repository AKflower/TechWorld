package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "PHIEUBAOHANH")
public class PHIEUBAOHANH {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SOPBH;
    private Date NGAYBATDAU;
    private Date NGAYKETTHUC;
    private int MASP;
    private int MAKH;
    private int MANV;

    public PHIEUBAOHANH(int SOPBH, Date NGAYBATDAU, Date NGAYKETTHUC, int MASP, int MAKH, int MANV) {
        this.SOPBH = SOPBH;
        this.NGAYBATDAU = NGAYBATDAU;
        this.NGAYKETTHUC = NGAYKETTHUC;
        this.MASP = MASP;
        this.MAKH = MAKH;
        this.MANV = MANV;
    }

    public PHIEUBAOHANH() {
    }
}