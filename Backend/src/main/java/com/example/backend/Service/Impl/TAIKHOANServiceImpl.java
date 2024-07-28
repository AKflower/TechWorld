package com.example.backend.Service.Impl;

import com.example.backend.Model.TAIKHOAN;
import com.example.backend.Repository.TAIKHOANRepository;
import com.example.backend.Service.TAIKHOANService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TAIKHOANServiceImpl implements TAIKHOANService {
    @Autowired
    TAIKHOANRepository taikhoanRepository;
    @Override
    public List<TAIKHOAN> findAll() {
        return taikhoanRepository.findAll();
    }

    @Override
    public TAIKHOAN findByUserName(String userName) {
        return taikhoanRepository.findByUserName(userName);
    }

    @Override
    public TAIKHOAN save(TAIKHOAN taikhoan) {
        return taikhoanRepository.save(taikhoan);
    }

    @Override
    public List<TAIKHOAN> findAllByRoleId(int roleId) {
        return taikhoanRepository.findAllByRoleId(roleId);
    }
}