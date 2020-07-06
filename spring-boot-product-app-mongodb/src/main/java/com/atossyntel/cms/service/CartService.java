package com.atossyntel.cms.service;

import java.util.List;

import com.atossyntel.cms.model.Cart;
import com.atossyntel.cms.model.Product;

public interface CartService {

	List<Cart> OrderProducts();
	
	Cart findProductById(int pid);

	 List<Cart> findAllProducts();


}
