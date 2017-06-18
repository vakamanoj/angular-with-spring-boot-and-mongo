package com.shoppingcart.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shoppingcart.demo.model.Checkout;
import com.shoppingcart.demo.repository.CheckoutRepository;

@Component
public class ShoppingServiceImpl implements ShoppingService {
	
	@Autowired
	private CheckoutRepository checkoutRepository;
	
	@Override
	public Checkout saveShoppingCart(Checkout checkout) {
		return checkoutRepository.save(checkout);
	}

}
