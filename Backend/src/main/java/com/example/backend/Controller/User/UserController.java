package com.example.backend.Controller.User;

import com.example.backend.Model.*;
import com.example.backend.Service.*;
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
    DONHANGService donhangService;
    KHACHHANGService khachhangService;
    TAIKHOANService taikhoanService;

    // Lấy toàn bộ sản phẩm
    @GetMapping("/api/products")
    public List<SANPHAM> getAllProducts() {
        return sanphamService.findAll();
    }

    // Lấy danh sách phiếu nhập
    @GetMapping("/api/getAllEnterCoupon")
    public List<PHIEUNHAP> getAllEnterCoupon() {
        return phieunhapService.findAll();
    }

    // Lấy danh sách phiếu trả
    @GetMapping("/api/getAllPaymentSlip")
    public List<PHIEUTRA> getAllPaymentSlip() {
        return phieutraService.findAll();
    }

    // Tạo phiếu nhập
    @PostMapping("/api/insertEnterCoupon")
    public PHIEUNHAP insertUser(@RequestBody PHIEUNHAP phieunhap) {
        return phieunhapService.save(phieunhap);
    }

    // Tạo phiếu trả
    @PostMapping("/api/insertPaymentSlip")
    public PHIEUTRA insertUser(@RequestBody PHIEUTRA phieutra) {
        return phieutraService.save(phieutra);
    }

    // Lấy danh sách bình luận
    @GetMapping("/api/getAllCommentByProduct")
    public List<BINHLUAN> getAllCommentByProduct(@RequestParam("MaSP") int MaSP) {
        return binhluanService.findByProduct(MaSP);
    }

    // Tạo hoặc cập nhật bình luận
    @PostMapping("/api/insertComment")
    public BINHLUAN insertUser(@RequestBody BINHLUAN binhluan) {
        return binhluanService.save(binhluan);
    }

    // Tạo đơn hàng
    @PostMapping("/api/insertDonHang")
    public DONHANG insertDonHang(@RequestBody DONHANG donhang) {
        return donhangService.save(donhang);
    }

    // Tạo giỏ hàng
    @PostMapping("/api/insertGioHang")
    public KHACHHANG insertGioHang(@RequestBody KHACHHANG khachhang) {
        return khachhangService.save(khachhang);
    }

    // Lấy toàn bộ đơn hàng
    @GetMapping("/api/getAllDonHang")
    public List<DONHANG> getAllDonHang() {
        return donhangService.findAll();
    }

    // Lấy thông tin tài khoản theo role
    @GetMapping("/api/getEmployeeByRole")
    public List<TAIKHOAN> getEmployeeByRole(@RequestParam("roleId") int roleId) {
        return taikhoanService.findAllByRoleId(roleId);
    }
}