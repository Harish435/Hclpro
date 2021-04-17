package com.practice.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBeans {
	
	public MyBeans() {
		System.out.println("In MyBeans() of MyBeans class");
	}
	@PostConstruct
	private void init() {
		System.out.println("calling init method for post construct");
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("calling destroy method for pre destroy");
	}

	public void close() { // to check whether it gets called when our bean is destroyed or not
		System.out.println("Closing All Resources");
	}

}
