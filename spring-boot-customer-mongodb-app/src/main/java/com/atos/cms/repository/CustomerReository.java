package com.atos.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atos.cms.model.Customer;
// extends the Mongo Repository to automatically handle the crud queries.
@Repository
public interface CustomerReository  extends MongoRepository<Customer, Integer> {

}
