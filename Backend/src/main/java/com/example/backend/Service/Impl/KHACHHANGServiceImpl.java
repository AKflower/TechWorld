package com.example.backend.Service.Impl;

import com.example.backend.Model.KHACHHANG;
import com.example.backend.Repository.KHACHHANGRepository;
import com.example.backend.Service.KHACHHANGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KHACHHANGServiceImpl implements KHACHHANGService {
    @Autowired
    KHACHHANGRepository khachhangRepository;
    @Override
    public List<KHACHHANG> findAll() {
        return khachhangRepository.findAll();
    }
}