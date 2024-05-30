package com.poly.sof3021.B8_JPA.controller;

import com.poly.sof3021.B8_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository repo;

    @GetMapping("/hienthiproduct")
    public String hienthi(Model model) {
        model.addAttribute("list", repo.findAll());
        return "products";
    }

}
