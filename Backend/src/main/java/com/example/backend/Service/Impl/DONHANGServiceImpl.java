package com.example.backend.Service.Impl;

import com.example.backend.Model.DONHANG;
import com.example.backend.Repository.DONHANGRepository;
import com.example.backend.Service.DONHANGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DONHANGServiceImpl implements DONHANGService {
    @Autowired
    DONHANGRepository donhangRepository;
    @Override
    public List<DONHANG> findAll() {
        return donhangRepository.findAll();
    }

    @Override
    public DONHANG save(DONHANG donhang) {
        return donhangRepository.save(donhang);
    }
}