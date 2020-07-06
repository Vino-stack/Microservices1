package com.atossyntel.cms.model;

import java.util.Random;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cart")
public class Cart {
	
	@Id // pk
	private int cid;
	
	private Product product;
	private int pid;
	private String pname;	 
	 private int pprice;
	 
	 public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Cart(Product product) {
		super();
		this.product = product;
	}

	public Cart() {
		 this.cid=new Random().nextInt(100000);
		}
	 
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int price) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", product=" + product + ", pid=" + pid + ", pname=" + pname + ", pprice=" + pprice
				+ "]";
	}

	

}
