package com.example.servlet.config;

import com.example.servlet.filter.MyFilter;
import com.example.servlet.listener.Listener;
import com.example.servlet.servlet.MyServlet;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * 通过配置类的方式引入servlet
 */
@SpringBootConfiguration
public class ServletConfiguration {

    @Bean
    public ServletRegistrationBean<MyServlet> registrationBean() {
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>();
        bean.setServlet(new MyServlet());
        bean.setUrlMappings(Arrays.asList("/my"));
        return  bean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter> filterFilterRegistrationBean() {
        FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyFilter());
        bean.setUrlPatterns(Arrays.asList("/*"));

        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean<Listener> servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<Listener> listener = new ServletListenerRegistrationBean<>();
        listener.setListener(new Listener());

        return listener;
    }
}
