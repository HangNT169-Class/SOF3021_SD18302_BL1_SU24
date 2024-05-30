package com.poly.sof3021.B8_JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_code")
    private String productCode;

    @Column
    private Float price;

    @Column
    private String description;

    // 1 cate -> N product
    // 1 product -> 1 cate
    @ManyToOne // => fetch eager
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category1 cate;
    // Load len table :
    // Product ID, Product Code, Product Name, Price, Category Code, Category Name
}
