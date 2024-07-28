package com.example.backend.Service;

import com.example.backend.Model.SANPHAM;
import com.example.backend.Model.TAIKHOAN;

import java.util.List;

public interface TAIKHOANService {
    List<TAIKHOAN> findAll();
    TAIKHOAN findByUserName(String userName);

    TAIKHOAN save(TAIKHOAN taikhoan);

    List<TAIKHOAN> findAllByRoleId(int roleId);
}