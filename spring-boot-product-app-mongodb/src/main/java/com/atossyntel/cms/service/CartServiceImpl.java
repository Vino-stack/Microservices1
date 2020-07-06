package com.atossyntel.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atossyntel.cms.model.Cart;
import com.atossyntel.cms.model.Product;
import com.atossyntel.cms.repository.CartRepository;

@Service("esi3")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository repository;
	
	@Override
	public List<Cart> OrderProducts() {

		return repository.findAll();
	}

	public 	Cart findProductById(int pid) {
		return repository.findById(pid).get();
		
	}
	
	@Override
	public List<Cart> findAllProducts() {

		return repository.findAll();
	}


}
