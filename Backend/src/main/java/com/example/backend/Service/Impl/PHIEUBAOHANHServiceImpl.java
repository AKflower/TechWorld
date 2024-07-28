package com.example.backend.Service.Impl;

import com.example.backend.Model.PHIEUBAOHANH;
import com.example.backend.Repository.PHIEUBAOHANHRepository;
import com.example.backend.Service.PHIEUBAOHANHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PHIEUBAOHANHServiceImpl implements PHIEUBAOHANHService {
    @Autowired
    PHIEUBAOHANHRepository phieubaohanhRepository;
    @Override
    public List<PHIEUBAOHANH> findAll() {
        return phieubaohanhRepository.findAll();
    }
}