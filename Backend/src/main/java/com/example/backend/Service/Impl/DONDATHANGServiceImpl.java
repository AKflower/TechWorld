package com.example.backend.Service.Impl;

import com.example.backend.Model.DONDATHANG;
import com.example.backend.Repository.DONDATHANGRepository;
import com.example.backend.Service.DONDATHANGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DONDATHANGServiceImpl implements DONDATHANGService {
    @Autowired
    DONDATHANGRepository dondathangRepository;
    @Override
    public List<DONDATHANG> findAll() {
        return dondathangRepository.findAll();
    }
}