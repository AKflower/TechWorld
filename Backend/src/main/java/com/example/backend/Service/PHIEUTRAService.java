package com.example.backend.Service;

import com.example.backend.Model.PHIEUTRA;

import java.util.List;

public interface PHIEUTRAService {
    List<PHIEUTRA> findAll();

    PHIEUTRA save(PHIEUTRA phieutra);
}