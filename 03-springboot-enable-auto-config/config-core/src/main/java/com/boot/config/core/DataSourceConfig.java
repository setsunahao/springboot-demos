package com.boot.config.core;

import org.springframework.boot.SpringBootConfiguration;
import com.boot.config.core.DatasourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "my.jdbc")
    public DatasourceProperties createDataSource(){
        return new DatasourceProperties();
    }

}
