package com.example.backend.Service.Impl;

import com.example.backend.Model.BINHLUAN;
import com.example.backend.Repository.BINHLUANRepository;
import com.example.backend.Service.BINHLUANService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BINHLUANServiceImpl implements BINHLUANService {
    @Autowired
    BINHLUANRepository BINHLUANRepository;
    @Override
    public List<BINHLUAN> findAll() {
        return BINHLUANRepository.findAll();
    }
}