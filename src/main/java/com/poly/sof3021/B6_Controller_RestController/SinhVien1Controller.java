package com.poly.sof3021.B6_Controller_RestController;

import com.poly.sof3021.B4_CRUDListFixCung.entity.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // Restfull API => json
public class SinhVien1Controller {

    @GetMapping("/a")
    public List<SinhVien> getAll() {
        List<SinhVien> lists = new ArrayList<>();
        lists.add(new SinhVien("123", "Nguyen Manh A", "Vinh Phuc", true, 18));
        lists.add(new SinhVien("124", "Nguyen Manh B", "HN", false, 19));
        lists.add(new SinhVien("125", "Nguyen Manh C", "Vinh Phuc", false, 111));
        lists.add(new SinhVien("126", "Nguyen Manh D", "HN", false, 21));
        lists.add(new SinhVien("127", "Nguyen Manh E", "Vinh Phuc", true, 111111));
        return lists;
    }
}
