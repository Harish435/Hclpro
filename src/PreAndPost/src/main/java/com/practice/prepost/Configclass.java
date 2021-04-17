package com.practice.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configclass {
	
	@Bean
    @Scope(value="prototype")
    public MyBeans myBean() {
	return new MyBeans();
    }

}
