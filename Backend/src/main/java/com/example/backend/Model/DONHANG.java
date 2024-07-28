package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "DONHANG")
public class DONHANG {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MADH;
    private Date NGAYDAT;
    private String TRANGTHAI;
    private Double PHIVANCHUYEN;
    private String SDTNN;
    private Date NGAYNHAN;
    private String DIACHI;
    private String TENN;
    private int MAKH;
    private int MANV_DUYET;
    private int MANV_GIAO;

    public DONHANG(int MADH, Date NGAYDAT, String TRANGTHAI, Double PHIVANCHUYEN, String SDTNN, Date NGAYNHAN, String DIACHI, String TENN, int MAKH, int MANV_DUYET, int MANV_GIAO) {
        this.MADH = MADH;
        this.NGAYDAT = NGAYDAT;
        this.TRANGTHAI = TRANGTHAI;
        this.PHIVANCHUYEN = PHIVANCHUYEN;
        this.SDTNN = SDTNN;
        this.NGAYNHAN = NGAYNHAN;
        this.DIACHI = DIACHI;
        this.TENN = TENN;
        this.MAKH = MAKH;
        this.MANV_DUYET = MANV_DUYET;
        this.MANV_GIAO = MANV_GIAO;
    }

    public DONHANG() {
    }
}