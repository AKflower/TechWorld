package com.example.backend.Controller.User;

import com.example.backend.Model.SANPHAM;
import com.example.backend.Service.SANPHAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    SANPHAMService sanphamService;

    @GetMapping("/api/products")
    public List<SANPHAM> getAllProducts() {
        return sanphamService.findAll();
    }
}