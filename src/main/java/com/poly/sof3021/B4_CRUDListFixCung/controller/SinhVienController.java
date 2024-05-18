package com.poly.sof3021.B4_CRUDListFixCung.controller;

import com.poly.sof3021.B4_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3021.B4_CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller // => tra ve view
@RequestMapping("/sinh-vien/") // TACH PHAN CHUNG
public class SinhVienController {
    // MVC => view
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

    @GetMapping("view-add")
    public String viewAddSinhVien() {
        return "buoi4/add-sinh-vien";
    }

    @PostMapping("add")
    public String addSinhVien(@RequestParam("mssv") String ma,
                              @RequestParam("ten") String ten,
                              @RequestParam("tuoi") String tuoi,
                              @RequestParam("diaChi") String diaChi,
                              @RequestParam("gioiTinh") String gioiTinh) {
        // B1: Tao 1 doi tuong sinh vien
        SinhVien sv = new SinhVien(ma, ten, diaChi, Boolean.valueOf(gioiTinh), Integer.valueOf(tuoi));
        // B2: goi add trong service 
        service.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("detail/{ma}")
    public String detailSinhVien(@PathVariable String ma, Model model) {
        SinhVien sv = service.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("view-update/{ma}")
    public String viewUpdateSinhVien(@PathVariable String ma, Model model) {
        SinhVien sv = service.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "buoi4/update-sinh-vien";
    }

    @GetMapping("/a")
    @ResponseBody // json
    public List<SinhVien> getAll() {
        List<SinhVien> lists = new ArrayList<>();
        lists.add(new SinhVien("123", "Nguyen Manh A", "Vinh Phuc", true, 18));
        lists.add(new SinhVien("124", "Nguyen Manh B", "HN", false, 19));
        lists.add(new SinhVien("125", "Nguyen Manh C", "Vinh Phuc", false, 111));
        lists.add(new SinhVien("126", "Nguyen Manh D", "HN", false, 21));
        lists.add(new SinhVien("127", "Nguyen Manh E", "Vinh Phuc", true, 111111));
        return lists;
    }

    @GetMapping("/b")
    @ResponseBody
    public String abcd(){
        return "thanh cong";
    }
}
