package com.example.backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "BINHLUAN")
public class BINHLUAN {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MABINHLUAN;
    private int DIEM;
    private String NHANXET;
    private Date NGAYBL;
    private int MAKH;
    private int MASP;

    public BINHLUAN(int MABINHLUAN, int DIEM, String NHANXET, Date NGAYBL, int MAKH, int MASP) {
        this.MABINHLUAN = MABINHLUAN;
        this.DIEM = DIEM;
        this.NHANXET = NHANXET;
        this.NGAYBL = NGAYBL;
        this.MAKH = MAKH;
        this.MASP = MASP;
    }

    public BINHLUAN() {

    }
}