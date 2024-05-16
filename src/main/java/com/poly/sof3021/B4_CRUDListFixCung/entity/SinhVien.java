package com.poly.sof3021.B4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// import wildcard => import *
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder // Tao contructor tuy y tham so
@ToString
public class SinhVien {

    private String mssv;

    private String ten;

    private String diaChi;

    private boolean gioiTinh;

    private int tuoi;

}
