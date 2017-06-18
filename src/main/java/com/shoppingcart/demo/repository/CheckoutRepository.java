package com.shoppingcart.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.shoppingcart.demo.model.Checkout;



@Repository
public interface CheckoutRepository extends MongoRepository<Checkout,String> {
	//Checkout findById(String id);   
}
