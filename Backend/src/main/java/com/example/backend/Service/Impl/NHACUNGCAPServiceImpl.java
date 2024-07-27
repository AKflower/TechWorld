package com.example.backend.Service.Impl;

import com.example.backend.Model.NHACUNGCAP;
import com.example.backend.Repository.NHACUNGCAPRepository;
import com.example.backend.Service.NHACUNGCAPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NHACUNGCAPServiceImpl implements NHACUNGCAPService {
    @Autowired
    NHACUNGCAPRepository nhacungcapRepository;
    @Override
    public List<NHACUNGCAP> findAll() {
        return nhacungcapRepository.findAll();
    }
}