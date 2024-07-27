package com.example.backend.Service.Impl;

import com.example.backend.Model.PHIEUTRA;
import com.example.backend.Repository.PHIEUTRARepository;
import com.example.backend.Service.PHIEUTRAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PHIEUTRAServiceImpl implements PHIEUTRAService {
    @Autowired
    PHIEUTRARepository phieutraRepository;
    @Override
    public List<PHIEUTRA> findAll() {
        return phieutraRepository.findAll();
    }
}