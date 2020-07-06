package com.atos.cms.service;

import java.util.List;

import com.atos.cms.model.Customer;

public interface CustomerService {
	boolean addCustomer(Customer customer);

	boolean updateCustomer(Customer customer);

	boolean deleteCustomer(int customerId);

	Customer findCustomerById(int customerId);

	List<Customer> findAllCustomers();


}
