package com.poly.sof3021.B1_OverviewSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Tat ca nhung class/package DEU PHAI NAM SAU TRONG CUNG com.
// Spring nhan tat ca nhung class duoc danh dau la 1 BEAN nam o trong com
public class DemoController {

    // client(GIAO DIEN - FE) & server (JAVA - LOGIC) trao doi thong qua phuong thuc HTTP
    // bang cac phuong thuc co ban: GET, POST, PUT, DELETE
    // J4: chi dung 2 cai GET(Lay / Hien thi)  & POST (Xu ly)

    // MVC => Controller: TAT CA CAC HAM TRONG CONTROLLER LUON LUON TRA VE 1 STRING (RETURN 1 VIEW)
    @GetMapping("/xin-chao")
    public String hienThiGiaoDien(Model model){
        // Truyen gia tri tu controller -> jsp
        // J4: setAttribute
        // J5: Model: addAttribute -> ui
        String mess = "Ahihi do ngoc ";
        model.addAttribute("a1",mess);
        return "a"; // return ten cua giao dien mong muon
    }

}
