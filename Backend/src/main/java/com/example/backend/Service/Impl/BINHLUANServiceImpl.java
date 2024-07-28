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
    BINHLUANRepository binhluanRepository;
    @Override
    public List<BINHLUAN> findAll() {
        return binhluanRepository.findAll();
    }

    @Override
    public BINHLUAN save(BINHLUAN binhluan) {
        return binhluanRepository.save(binhluan);
    }

    @Override
    public List<BINHLUAN> findByProduct(int maSP) {
        return binhluanRepository.findAllCommentByProduct(maSP);
    }
}