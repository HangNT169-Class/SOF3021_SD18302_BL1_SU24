package com.poly.sof3021.B4_CRUDListFixCung.service;

import com.poly.sof3021.B4_CRUDListFixCung.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // khoi tao vao contructor
        // add 5 phan tu
        lists.add(new SinhVien("123", "Nguyen Manh A", "Vinh Phuc", true, 18));
        lists.add(new SinhVien("124", "Nguyen Manh B", "HN", false, 19));
        lists.add(new SinhVien("125", "Nguyen Manh C", "Vinh Phuc", false, 111));
        lists.add(new SinhVien("126", "Nguyen Manh D", "HN", false, 21));
        lists.add(new SinhVien("127", "Nguyen Manh E", "Vinh Phuc", true, 111111));
    }

    public List<SinhVien> getAll() {
        return lists;
    }

    public void xoaSinhVien(String mssv) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(mssv)) {
                lists.remove(i); // Xoa vi tri tim dc
            }
        }
    }

    public void addSinhVien(SinhVien sv){
        lists.add(sv);
    }

    public SinhVien detailSinhVien(String ma){
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(ma)) {
                return lists.get(i);
            }
        }
        return null;
    }
}
