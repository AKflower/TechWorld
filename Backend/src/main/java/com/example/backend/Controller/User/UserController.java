package com.example.backend.Controller.User;

import com.example.backend.Model.*;
import com.example.backend.Service.BINHLUANService;
import com.example.backend.Service.PHIEUNHAPService;
import com.example.backend.Service.PHIEUTRAService;
import com.example.backend.Service.SANPHAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    SANPHAMService sanphamService;
    PHIEUNHAPService phieunhapService;
    PHIEUTRAService phieutraService;
    BINHLUANService binhluanService;

    @GetMapping("/api/products")
    public List<SANPHAM> getAllProducts() {
        return sanphamService.findAll();
    }

    @GetMapping("/api/getAllEnterCoupon")
    public List<PHIEUNHAP> getAllEnterCoupon() {
        return phieunhapService.findAll();
    }

    @GetMapping("/api/getAllPaymentSlip")
    public List<PHIEUTRA> getAllPaymentSlip() {
        return phieutraService.findAll();
    }


    @PostMapping("/api/insertEnterCoupon")
    public PHIEUNHAP insertUser(@RequestBody PHIEUNHAP phieunhap) {
        return phieunhapService.save(phieunhap);
    }

    @PostMapping("/api/insertPaymentSlip")
    public PHIEUTRA insertUser(@RequestBody PHIEUTRA phieutra) {
        return phieutraService.save(phieutra);
    }

    @GetMapping("/api/getAllCommentByProduct")
    public List<BINHLUAN> getAllCommentByProduct(@RequestParam("MaSP") int MaSP) {
        return binhluanService.findByProduct(MaSP);
    }

    @PostMapping("/api/insertComment")
    public BINHLUAN insertUser(@RequestBody BINHLUAN binhluan) {
        return binhluanService.save(binhluan);
    }
}