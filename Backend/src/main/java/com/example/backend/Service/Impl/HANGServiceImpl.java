package com.example.backend.Service.Impl;

import com.example.backend.Model.HANG;
import com.example.backend.Repository.HANGRepository;
import com.example.backend.Service.HANGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HANGServiceImpl implements HANGService {
    @Autowired
    HANGRepository hangRepository;
    @Override
    public List<HANG> findAll() {
        return hangRepository.findAll();
    }
}