package com.atossyntel.cms.service;

import java.util.List;

import com.atossyntel.cms.model.Product;
import com.atossyntel.cms.model.Cart;


public interface ProductService {

	

	Product findProductById(int pid);

	boolean deleteProduct(int pid);

	boolean updateProduct(Product product);

	boolean addProduct(Product product);

	 List<Product> findAllProducts();
	 
	 List<Cart> OrderProducts();
	// List<Product> findSearchedProducts(String freetext);

}
