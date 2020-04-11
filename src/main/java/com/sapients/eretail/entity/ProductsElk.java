package com.sapients.eretail.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "products")

@Document(indexName = "eretail_products_index", type = "products", shards = 1, replicas = 0,
        refreshInterval = "-1")
public class ProductsElk {
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
