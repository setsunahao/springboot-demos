package com.example.logging;

import com.example.logging.a.TestLogger;
import com.example.logging.b.TestLogger1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LoggingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LoggingApplication.class, args);

        TestLogger logger = context.getBean(TestLogger.class);
        logger.testLog();

        TestLogger1 logger1 = context.getBean(TestLogger1.class);
        logger1.testLog();

        context.close();
    }
}
