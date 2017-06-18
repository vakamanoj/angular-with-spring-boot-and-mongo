package com.shoppingcart.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.demo.model.Checkout;
import com.shoppingcart.demo.service.ShoppingService;
import com.mongodb.WriteConcernException;


@RestController
@RequestMapping(value = "/checkout")
public class ShoppingResource {
	
	@Autowired
	ShoppingService shoppingService;
	/**
	   * Processes the HTTP POST request to save an instance of {@code Checkout Details}.
	   *
	   * @param checkout the representation of a checkout DB collection in MongoDB
	   */
	@RequestMapping(value = "/addPurchase", method= RequestMethod.POST,produces="application/json", consumes="application/json")  
	  public ResponseEntity<Checkout> save(@RequestBody Checkout checkout) {
	    try {
	    	
	    	System.out.println("Checkout Details "+ checkout.getTotalPrice());
	    	checkout = shoppingService.saveShoppingCart(checkout);
	    	return new ResponseEntity("{ \"PurchaseId\" : \""+checkout.getId() + "\"}" , HttpStatus.CREATED);
	    
	    } catch (WriteConcernException ex) {
	     // throw new WebApplicationException(ex.getMessage(), Response.Status.BAD_REQUEST);
	    	return null;
	    }
		
		
	  }
}

