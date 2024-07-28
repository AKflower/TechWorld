package com.example.backend.Controller.Admin;

import com.example.backend.Model.SANPHAM;
import com.example.backend.Service.SANPHAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    SANPHAMService sanphamService;

    @GetMapping("/api/getProduct")
    public Optional<SANPHAM> getProduct(@RequestParam("id") int id) {
        return sanphamService.findById(id);
    }

    @PostMapping("/api/insertProduct")
    public SANPHAM insertUser(@RequestBody SANPHAM sanpham) {
        return sanphamService.save(sanpham);
    }
}