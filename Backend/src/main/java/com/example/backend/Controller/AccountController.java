package com.example.backend.Controller;

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
        return taikhoanService.save(taikhoan);
    }
}