package com.sapients.eretail.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Getter
@Setter
@RequiredArgsConstructor

public class Products {
    public Products(String productName, String brand, Double price, String color, String seller, String sku,int quantity, String size){
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.seller = seller;
        this.sku = sku;
        this.quantity = quantity;
        this.size = size;
    }
    @Id
    @GeneratedValue
    private Long id;
    private String productName;
    private String brand;
    private Double price;
    private String color;
    private String seller;
    private String sku;
    private int quantity;
    private String size;
}
