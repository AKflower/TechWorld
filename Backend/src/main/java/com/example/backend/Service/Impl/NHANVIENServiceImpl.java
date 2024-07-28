package com.example.backend.Service.Impl;

import com.example.backend.Model.NHANVIEN;
import com.example.backend.Repository.NHANVIENRepository;
import com.example.backend.Service.NHANVIENService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NHANVIENServiceImpl implements NHANVIENService {
    @Autowired
    NHANVIENRepository nhanvienRepository;
    @Override
    public List<NHANVIEN> findAll() {
        return nhanvienRepository.findAll();
    }
}