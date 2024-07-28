package com.example.backend.Controller;

import com.example.backend.Model.TAIKHOAN;
import com.example.backend.Service.TAIKHOANService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    TAIKHOANService taikhoanService;

    @GetMapping("/api/info")
    public TAIKHOAN getInfoUser(Model model,
                                   @RequestParam("userName") String userName) {
        return taikhoanService.findByUserName(userName);
    }

    @PostMapping("/api/insertUser")
    public TAIKHOAN insertUser(@RequestBody TAIKHOAN taikhoan) {
        return taikhoanService.save(taikhoan);
    }
}