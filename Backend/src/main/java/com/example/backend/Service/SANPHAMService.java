package com.example.backend.Service;

import com.example.backend.Model.SANPHAM;

import java.util.List;
import java.util.Optional;

public interface SANPHAMService {
    List<SANPHAM> findAll();

    Optional<SANPHAM> findById(int id);

    SANPHAM save(SANPHAM sanpham);
}