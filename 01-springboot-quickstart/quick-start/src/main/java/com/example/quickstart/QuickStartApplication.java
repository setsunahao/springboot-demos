package com.example.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * SpringBoot启动类：
 * 1、使用@SpringBootApplication
 * 2、提供应用程序的入口执行
 */
@SpringBootApplication
public class QuickStartApplication {

    public static void main(String[] args) {
        //SpringApplication.run(QuickStartApplication.class, args);

        //加载多个源
        //SpringApplication app = new SpringApplication();
        //app.addPrimarySources(Arrays.asList(QuickStartApplication2.class, QuickStartApplication3.class));
        //app.run(args);
    }
}
