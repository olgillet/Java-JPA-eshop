package com.eshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eshop.dao.ProductDao;
import com.eshop.model.Product;
import com.eshop.repository.ProductRepository;

@Component
public class Application {
	
    @Autowired
    ProductDao productDao;
    
    @Autowired
    ProductRepository productRepository;
    
    public void run() {

    	productDao.create(new Product("product1", 1000d, null, null, null, null, "description1", null, null));
    	productDao.create(new Product("product2", 2000d, null, null, null, null, "description2", null, null));
    	productDao.create(new Product("product3", 3000d, null, null, null, null, "description3", null, null));
    	productDao.create(new Product("product4", 4000d, null, null, null, null, "description4", null, null));
    	productDao.create(new Product("product5", 5000d, null, null, null, null, "abcde", null, null));
    	productDao.create(new Product("product6", 6000d, null, null, null, null, "ascriptbcde", null, null));
    	productDao.create(new Product("product7", 7000d, null, null, null, null, "script", null, null));
    	
    	// Find all products
    	System.out.println("\n****** productFindAllList");
    	List<Product> productFindAllList = productDao.findAll();
    	for(Product p : productFindAllList) {
    		System.out.println("- "+ p.toString());
    	}
    	
    	// Find products by description (exact)
    	System.out.println("\n****** productByDescription (exact)");
    	List<Product> productByDescription = productRepository.findByDescription("description3");
    	for(Product p : productByDescription) {
    		System.out.println("- "+ p.toString());
    	}
    	
    	// Find products by description contained (like)
    	System.out.println("\n****** productByDescriptionLike");
    	List<Product> productByDescriptionLike = productRepository.findByDescriptionLike("script");
    	for(Product p : productByDescriptionLike) {
    		System.out.println("- "+ p.toString());
    	}
    	
    	// Find products by price range
    	System.out.println("\n****** productByUnitPriceBetween");
    	List<Product> productByUnitPriceBetween = productRepository.findProductByUnitPriceBetween(2000d, 3000d);
    	for(Product p : productByUnitPriceBetween) {
    		System.out.println("- "+ p.toString());
    	}
    	
    }
}
