package com.sapients.eretail.repository;

import com.sapients.eretail.entity.ProductsElk;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SearchRepository extends ElasticsearchRepository<ProductsElk, String> {

}
