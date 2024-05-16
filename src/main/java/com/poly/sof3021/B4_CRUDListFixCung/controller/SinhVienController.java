package com.poly.sof3021.B4_CRUDListFixCung.controller;

import com.poly.sof3021.B4_CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sinh-vien/") // TACH PHAN CHUNG
public class SinhVienController {

    private SinhVienService service = new SinhVienService();

    @GetMapping("hien-thi")
//    @RequestMapping(value = "hien-thi",method = RequestMethod.POST)
    public String hienThiSinhVien(Model model) {
        model.addAttribute("list", service.getAll());
        return "buoi4/sinhviens";
    }

    @GetMapping("remove/{ma1}")
    public String xoaSinhVien(@PathVariable("ma1") String ma2) {
        service.xoaSinhVien(ma2);
        return "redirect:/sinh-vien/hien-thi";
    }
}
