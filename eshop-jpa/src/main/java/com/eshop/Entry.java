package com.eshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.eshop.config.AppConfig;
import com.eshop.dao.ProductDao;
import com.eshop.model.Product;

@Component
public class Entry {
	@Autowired
	ProductDao productDao;
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBeanFactory().createBean(Application.class).run();
		context.close();

	}

}
