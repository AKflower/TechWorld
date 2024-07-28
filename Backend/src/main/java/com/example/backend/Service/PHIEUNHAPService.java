package com.example.backend.Service;

import com.example.backend.Model.PHIEUNHAP;

import java.util.List;

public interface PHIEUNHAPService {
    List<PHIEUNHAP> findAll();

    PHIEUNHAP save(PHIEUNHAP phieunhap);
}