package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
@Entity
@Table(name = "NHACUNGCAP")
public class NHACUNGCAP {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MANCC;
    private String TENNCC;
    private String DIACHI;
    private String EMAIL;
    private String SODIENTHOAI;
    private String MST;

    public NHACUNGCAP(int MANCC, String TENNCC, String DIACHI, String EMAIL, String SODIENTHOAI, String MST) {
        this.MANCC = MANCC;
        this.TENNCC = TENNCC;
        this.DIACHI = DIACHI;
        this.EMAIL = EMAIL;
        this.SODIENTHOAI = SODIENTHOAI;
        this.MST = MST;
    }

    public NHACUNGCAP() {
    }
}