package com.example.backend.Service.Impl;

import com.example.backend.Model.QUYEN;
import com.example.backend.Repository.QUYENRepository;
import com.example.backend.Service.QUYENService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QUYENServiceImpl implements QUYENService {
    @Autowired
    QUYENRepository quyenRepository;
    @Override
    public List<QUYEN> findAll() {
        return quyenRepository.findAll();
    }
}