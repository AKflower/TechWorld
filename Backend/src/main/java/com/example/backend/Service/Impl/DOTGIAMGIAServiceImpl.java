package com.example.backend.Service.Impl;

import com.example.backend.Model.DOTGIAMGIA;
import com.example.backend.Repository.DOTGIAMGIARepository;
import com.example.backend.Service.DOTGIAMGIAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DOTGIAMGIAServiceImpl implements DOTGIAMGIAService {
    @Autowired
    DOTGIAMGIARepository dotgiamgiaRepository;
    @Override
    public List<DOTGIAMGIA> findAll() {
        return dotgiamgiaRepository.findAll();
    }
}