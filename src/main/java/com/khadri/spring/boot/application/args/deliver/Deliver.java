package com.khadri.spring.boot.application.args.deliver;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.khadri.spring.boot.application.args.order.OrderFood;

@Component
public class Deliver {

	@Autowired
	private OrderFood orderFood;

	public void delivery() {
		String[] orderItems = orderFood.getOrderItems();
		Arrays.asList(orderItems).stream().forEach((eachItem) -> {
			System.out.println("Deliver Item " + eachItem);
		});
	}
}
