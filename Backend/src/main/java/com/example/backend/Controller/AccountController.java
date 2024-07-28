package com.example.backend.Controller;

import com.example.backend.Model.KHACHHANG;
import com.example.backend.Model.NHANVIEN;
import com.example.backend.Model.TAIKHOAN;
import com.example.backend.Service.TAIKHOANService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {
    @Autowired
    TAIKHOANService taikhoanService;

    @GetMapping("/api/info")
    public TAIKHOAN getInfoUser(@RequestParam("userName") String userName) {
        return taikhoanService.findByUserName(userName);
    }

    @PostMapping("/api/insertUser")
    public TAIKHOAN insertUser(@RequestBody TAIKHOAN taikhoan) {
        if (taikhoan.getMAQUYEN() == 7) {
            KHACHHANG khachhang = taikhoan.getKhachHang();
            if (khachhang == null) {
                khachhang = new KHACHHANG();
                taikhoan.setKhachHang(khachhang);
            }

            khachhang.setTaiKhoan(taikhoan);
            khachhang.setTENDANGNHAP(taikhoan.getTENDANGNHAP());
        }
        else {
            NHANVIEN nhanvien = taikhoan.getNhanVien();
            if (nhanvien == null) {
                nhanvien = new NHANVIEN();
                taikhoan.setNhanVien(nhanvien);
            }
            nhanvien.setTaiKhoan(taikhoan);
            nhanvien.setTENDANGNHAP(taikhoan.getTENDANGNHAP());
        }
        return taikhoanService.save(taikhoan);
    }
}