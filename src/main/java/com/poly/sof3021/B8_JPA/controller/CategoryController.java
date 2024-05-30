package com.poly.sof3021.B8_JPA.controller;

import com.poly.sof3021.B8_JPA.entity.Category1;
import com.poly.sof3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping("/cate/hien-thi")
    public String hienThiDanhSachCate(Model model) {
        model.addAttribute("lists", repo.findAll()); // Hien thi tat ca danh sach
        // add hoac update
//        repo.save(thuc the )
        // xoa
//        repo.delete(thuc the);
//        repo.deleteById(khoa chinh )
        // detail
//        Category1 cate = repo.findById(khoa chinh).get();
        return "";
    }

    // DS : 10 ban ghi
    // 3 phan tu 1 trang
    // 1: 3 pt dau  <=> 0
    // 2: 3 pt tiep theo  <=> 1
    // 3: 3 pt tiep theo  <=> 2
    // 4: 1 pt tiep theo  <=> 3
    // Page
    @GetMapping("")
    @ResponseBody
    public List<Category1> phanTrang(
            @RequestParam(value = "size", defaultValue = "3") Integer size,
             @RequestParam(value = "pageNo", defaultValue = "0", required = false) Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<Category1> page = repo.findAll(pageable);
        return page.getContent();
    }
}
