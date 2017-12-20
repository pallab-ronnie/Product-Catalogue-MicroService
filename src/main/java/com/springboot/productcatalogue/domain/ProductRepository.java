package com.springboot.productcatalogue.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String>{

	public List<Product> findByProductType(ProductType productType);
}
