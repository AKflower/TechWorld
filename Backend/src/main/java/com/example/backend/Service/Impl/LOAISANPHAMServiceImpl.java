package com.example.backend.Service.Impl;

import com.example.backend.Model.LOAISANPHAM;
import com.example.backend.Repository.LOAISANPHAMRepository;
import com.example.backend.Service.LOAISANPHAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LOAISANPHAMServiceImpl implements LOAISANPHAMService {
    @Autowired
    LOAISANPHAMRepository loaisanphamRepository;
    @Override
    public List<LOAISANPHAM> findAll() {
        return loaisanphamRepository.findAll();
    }
}