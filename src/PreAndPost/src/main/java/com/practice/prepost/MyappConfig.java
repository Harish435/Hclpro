package com.practice.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyappConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(Configclass.class);
		ctx.refresh();

		MyBeans mb1 = ctx.getBean(MyBeans.class);
		System.out.println(mb1.hashCode());

		MyBeans mb2 = ctx.getBean(MyBeans.class);
		System.out.println(mb2.hashCode());

		ctx.close();

	}

}
