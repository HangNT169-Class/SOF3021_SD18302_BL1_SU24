package com.poly.sof3021.B2_LamQuenVoiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "/buoi2/login";
    }

    @PostMapping("/ket-qua")
    public String xuLyLogin(@RequestParam("uname") String username,
                            @RequestParam("psw")String pass, Model model){
        // Lay gia tri tu phia view -> controller
        // J4: getParamater
        // J5: @RequestParam
        model.addAttribute("u1",username);
        model.addAttribute("u2",pass);
        return "/buoi2/ket-qua";
    }
}
