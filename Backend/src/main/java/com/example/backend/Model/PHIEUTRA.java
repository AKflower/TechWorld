package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "PHIEUTRA")
public class PHIEUTRA {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAPT;
    private Date NGAYTRA;
    private String LYDO;
    private int SOHOADON;
    private int MANV;

    public PHIEUTRA(int MAPT, Date NGAYTRA, String LYDO, int SOHOADON, int MANV) {
        this.MAPT = MAPT;
        this.NGAYTRA = NGAYTRA;
        this.LYDO = LYDO;
        this.SOHOADON = SOHOADON;
        this.MANV = MANV;
    }

    public PHIEUTRA() {
    }
}
