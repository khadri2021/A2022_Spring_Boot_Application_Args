package com.khadri.spring.boot.application.args.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.khadri.spring.boot.application.args.deliver.Deliver;

@Component
public class DeliverRunner implements CommandLineRunner {

	@Autowired
	private Deliver deliver;
	
	@Override
	public void run(String... args) throws Exception {
		deliver.delivery();
	}

}
