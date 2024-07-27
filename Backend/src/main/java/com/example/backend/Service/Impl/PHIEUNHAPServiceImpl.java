package com.example.backend.Service.Impl;

import com.example.backend.Model.PHIEUNHAP;
import com.example.backend.Repository.PHIEUNHAPRepository;
import com.example.backend.Service.PHIEUNHAPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PHIEUNHAPServiceImpl implements PHIEUNHAPService {
    @Autowired
    PHIEUNHAPRepository phieunhapRepository;
    @Override
    public List<PHIEUNHAP> findAll() {
        return phieunhapRepository.findAll();
    }
}