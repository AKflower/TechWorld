package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "HOADON")
public class HOADON {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SOHOADON;
    private Date NGAYTAO;
    private String MST;
    private int MAHD;

    public HOADON(int SOHOADON, Date NGAYTAO, String MST, int MAHD) {
        this.SOHOADON = SOHOADON;
        this.NGAYTAO = NGAYTAO;
        this.MST = MST;
        this.MAHD = MAHD;
    }

    public HOADON() {
    }
}
