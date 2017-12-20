package com.springboot.productcatalogue.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.productcatalogue.domain.Product;
import com.springboot.productcatalogue.domain.ProductType;
import com.springboot.productcatalogue.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//Method to add a product
	@RequestMapping(method=RequestMethod.POST , value="/products", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}
	
	//Method to retrieve the list of products based on simple search criteria e.g. product type
	@RequestMapping(method=RequestMethod.GET , value="/products/{productType}" , produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts(@PathVariable ProductType productType) {
		return productService.getAllProducts(productType);
	}
	
	//Method to remove a product from the catalogue based the productId. 
	@RequestMapping(method= RequestMethod.DELETE, value="/products/{productId}")
	public void deleteProduct(@PathVariable String productId) {
		productService.deleteProduct(productId);
	}
}
