package com.poly.sof3021.B3_Request_ModelAttirbute.controller;

import com.poly.sof3021.B3_Request_ModelAttirbute.request.DangKyRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DangKyController {

    @GetMapping("/dang-ky")
    public String hienThiDangKy(Model model){
        // Tao 1 doi tuong moi de ben view hung loi
        model.addAttribute("dangKyRequest",new DangKyRequest());
        return "/buoi3/dang-ky";
    }

    @PostMapping("/dang-ky-thanh-cong")
    public String dangKy(Model model, @Valid DangKyRequest dangKyRequest, BindingResult result){
        // Khi co loi thi nhay vao day
        if(result.hasErrors()){
            return "/buoi3/dang-ky";
        }

        model.addAttribute("hoVaTen",dangKyRequest.getHoVaTen());
        model.addAttribute("tuoi",dangKyRequest.getTuoi());
        model.addAttribute("nganhHoc",dangKyRequest.getNganhHoc());
        model.addAttribute("queQuan",dangKyRequest.getQueQuan());
        model.addAttribute("matKhau",dangKyRequest.getMatKhau());
        model.addAttribute("xacNhanMatKhau",dangKyRequest.getXacNhanMatKhau());

        return "/buoi3/dang-ky-thanh-cong";
    }

}
