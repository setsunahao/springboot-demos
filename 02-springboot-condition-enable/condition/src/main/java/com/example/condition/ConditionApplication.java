package com.example.condition;

import com.example.condition.converter.EncodingConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class ConditionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConditionApplication.class, args);

        Map<String, EncodingConverter> beansType = context.getBeansOfType(EncodingConverter.class);
        System.out.println(beansType);
        System.out.println(System.getProperty("file.encoding"));
        context.close();
    }
}
