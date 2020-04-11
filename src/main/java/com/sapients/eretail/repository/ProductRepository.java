package com.sapients.eretail.repository;

import com.sapients.eretail.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
