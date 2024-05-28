package com.poly.sof3021.B8_JPA.controller;

import com.poly.sof3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping("/cate/hien-thi")
    public String hienThiDanhSachCate(Model model){
        model.addAttribute("lists",repo.findAll()); // Hien thi tat ca danh sach
        // add hoac update
//        repo.save(thuc the )
        // xoa
//        repo.delete(thuc the);
//        repo.deleteById(khoa chinh )
        // detail
//        Category1 cate = repo.findById(khoa chinh).get();
        return "";
    }
}
