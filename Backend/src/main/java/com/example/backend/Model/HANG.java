package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
@Entity
@Table(name = "HANG")
public class HANG {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAHANG;
    private String TENHANG;

    public HANG(int MAHANG, String TENHANG) {
        this.MAHANG = MAHANG;
        this.TENHANG = TENHANG;
    }

    public HANG() {
    }
}
