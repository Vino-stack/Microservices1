package com.atossyntel.cms.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atossyntel.cms.service.ProductService;
import com.atossyntel.cms.service.CartService;

@Controller
public class CartController {
	@Qualifier("esi2")
	@Autowired
	private ProductService productService;
	//private CartService cartService;


	@RequestMapping(value="/placeorder",method=RequestMethod.GET)
	public ModelAndView OrderProducts(){
	return new ModelAndView("Order", "products", productService.findAllProducts());	
	}
	
	@RequestMapping(value="/addtocart/{id}",method=RequestMethod.GET)
	public String addtoCart(@PathVariable("id") int cid,ModelMap map){
		map.addAttribute("cart",productService.findProductById(cid));
		map.addAttribute("carts",productService.findAllProducts());
		return  "Cart";			
	}
	
	@RequestMapping("/deletepp")
	public ModelAndView deleteItem(){
		return new ModelAndView("DeleteCartItem","message","No Products in Cart");
	
	}
	
	@RequestMapping(value="/buynow",method=RequestMethod.GET)
	public String GetDetails(){
		return "Address";
	}
	
	@RequestMapping("/Supplier")
	public String Supplier(){
		return "Notify";
	}
	}
