package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
@Entity
@Table(name = "QUYEN")
public class QUYEN {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAQUYEN;
    private String TENQUYEN;
    private String MOTA;

    public QUYEN(int MAQUYEN, String TENQUYEN, String MOTA) {
        this.MAQUYEN = MAQUYEN;
        this.TENQUYEN = TENQUYEN;
        this.MOTA = MOTA;
    }

    public QUYEN() {
    }
}