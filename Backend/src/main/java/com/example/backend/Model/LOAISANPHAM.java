package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Setter
@Getter
@Entity
@Table(name = "LOAISANPHAM")
public class LOAISANPHAM {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MALOAISP;
    private String TENLOAISP;
    private int MAHANG;

    public LOAISANPHAM(int MALOAISP, String TENLOAISP, int MAHANG) {
        this.MALOAISP = MALOAISP;
        this.TENLOAISP = TENLOAISP;
        this.MAHANG = MAHANG;
    }

    public LOAISANPHAM() {
    }
}
