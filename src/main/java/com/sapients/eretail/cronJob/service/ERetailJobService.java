package com.sapients.eretail.cronJob.service;

import com.sapients.eretail.entity.Products;
import com.sapients.eretail.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class ERetailJobService {
    @Autowired
    ProductRepository productRepository;
    private static final Logger LOG = LoggerFactory.getLogger(ERetailJobService.class);

    public void processData() {

        LOG.info("Updating inventory with from Different sellers");
        productRepository.save(new Products("Shirt","Peter England",560.00,"Black","ERetail Seller",UUID.randomUUID().toString(),1, "M"));
        productRepository.save(new Products("Shirt","Allen Solly",860.00,"Red","ERetail Seller",UUID.randomUUID().toString(),1, "L"));

        productRepository.save(new Products("Jeans Pant","Levis",560.00,"Brown","Some Seller",UUID.randomUUID().toString(),1,"XXL"));

        productRepository.save(new Products("Dress","Lee cooper",1660.00,"Blue","x Seller",UUID.randomUUID().toString(),1,"XL"));

        productRepository.save(new Products("Pant","Peter England",560.00,"White","ERetail Seller",UUID.randomUUID().toString(),1, "S"));



    }
}