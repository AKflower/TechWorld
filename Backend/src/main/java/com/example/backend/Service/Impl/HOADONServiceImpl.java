package com.example.backend.Service.Impl;

import com.example.backend.Model.HOADON;
import com.example.backend.Repository.HOADONRepository;
import com.example.backend.Service.HOADONService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HOADONServiceImpl implements HOADONService {
    @Autowired
    HOADONRepository hoadonRepository;
    @Override
    public List<HOADON> findAll() {
        return hoadonRepository.findAll();
    }
}