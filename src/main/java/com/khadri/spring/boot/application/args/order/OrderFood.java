package com.khadri.spring.boot.application.args.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class OrderFood {

	private ApplicationArguments applicationArguments;

	@Autowired
	public OrderFood(ApplicationArguments arguments) {
		this.applicationArguments = arguments;
	}

	public String[] getOrderItems() {
		return applicationArguments.getSourceArgs();
	}

}
