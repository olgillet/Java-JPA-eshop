package com.eshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.eshop.repository")
@ComponentScan(basePackages = "com.eshop")
@Import(JPAConfig.class)
public class AppConfig {

}
