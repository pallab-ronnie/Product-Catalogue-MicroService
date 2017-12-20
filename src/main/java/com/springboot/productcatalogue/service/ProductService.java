package com.springboot.productcatalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.productcatalogue.domain.Product;
import com.springboot.productcatalogue.domain.ProductRepository;
import com.springboot.productcatalogue.domain.ProductType;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> getAllProducts(ProductType productType){
		List<Product> productList = new ArrayList<>();
		productRepository.findByProductType(productType).forEach(productList::add);
		return productList;
	}

	public void deleteProduct(String id) {
		productRepository.delete(id);
	}
}
