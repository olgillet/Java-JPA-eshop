package com.eshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshop.config.AppConfig;

public class Entry {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBeanFactory().createBean(Application.class).run();
		context.close();

	}
}