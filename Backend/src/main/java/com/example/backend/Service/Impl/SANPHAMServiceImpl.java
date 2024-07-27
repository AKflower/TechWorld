package com.example.backend.Service.Impl;

import com.example.backend.Model.SANPHAM;
import com.example.backend.Repository.SANPHAMRepository;
import com.example.backend.Service.SANPHAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SANPHAMServiceImpl implements SANPHAMService {
    @Autowired
    SANPHAMRepository sanphamRepository;
    @Override
    public List<SANPHAM> findAll() {
        return sanphamRepository.findAll();
    }
}