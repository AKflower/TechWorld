package com.example.backend.Controller.User;

import com.example.backend.Model.SANPHAM;
import com.example.backend.Service.SANPHAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    SANPHAMService sanphamService;
    @RequestMapping("/")
    public String index(Model model) {
//        List<SANPHAM> sanPham = sanphamService.findAll();
        System.out.println("Test");
        return "user/index";
    }
}