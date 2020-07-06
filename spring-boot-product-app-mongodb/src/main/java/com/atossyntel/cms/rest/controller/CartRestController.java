package com.atossyntel.cms.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atossyntel.cms.model.Product;
import com.atossyntel.cms.service.ProductService;

@RequestMapping("/cart") // is common to all the mapping methods
@RestController //(@Controller+@ResponseBody)
public class CartRestController {

	@Qualifier("esi2")
	@Autowired
	
	private ProductService productService;

	public CartRestController() {
		System.out.println("CartRestController created...");

	}
	
	@GetMapping
	public List<Product> getAllProducts() {
		System.out.println("In get allproducts");
		return productService.findAllProducts();
	}
	/*
	@PostMapping
	public List<Product> addProduct(@RequestBody Product product) {
		System.out.println("In add product to cart " + product);
		productService.addProduct(product);
		return productService.findAllProducts();
	}	
	
	*/
}
