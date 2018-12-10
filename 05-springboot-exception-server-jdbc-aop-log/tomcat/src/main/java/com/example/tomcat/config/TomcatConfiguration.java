package com.example.tomcat.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

//@Component
public class TomcatConfiguration implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        System.out.println("--------------------");
        factory.setContextPath("/demo");
        factory.setPort(8090);
        factory.setProtocol("org.apache.coyote.http11.Http11NioProtocol");
    }
}
