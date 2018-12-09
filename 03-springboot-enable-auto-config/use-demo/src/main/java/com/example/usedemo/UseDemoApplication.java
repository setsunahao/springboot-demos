package com.example.usedemo;

import com.boot.config.core.DatasourceProperties;
import com.boot.config.core.domain.Order;
import com.boot.config.core.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UseDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UseDemoApplication.class, args);

        System.out.println(context.getBean(Order.class));

        System.out.println(context.getBean(Product.class));

        System.out.println(context.getBean(DatasourceProperties.class).getDriverClassName());

        context.close();
    }
}
