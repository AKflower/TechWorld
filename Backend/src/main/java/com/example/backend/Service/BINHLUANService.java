package com.example.backend.Service;

import com.example.backend.Model.BINHLUAN;

import java.util.List;

public interface BINHLUANService {
    List<BINHLUAN> findAll();

    BINHLUAN save(BINHLUAN binhluan);

    List<BINHLUAN> findByProduct(int maSP);
}