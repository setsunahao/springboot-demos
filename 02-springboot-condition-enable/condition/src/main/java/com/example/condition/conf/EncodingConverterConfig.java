package com.example.condition.conf;


import com.example.condition.cond.GBKCondition;
import com.example.condition.cond.UTF8Condition;
import com.example.condition.converter.EncodingConverter;
import com.example.condition.converter.GBKEncodingConverter;
import com.example.condition.converter.UTF8EncodingConverter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
@Conditional(UTF8Condition.class)
public class EncodingConverterConfig {

    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConverter createUTF8Converter(){
        return new UTF8EncodingConverter();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConverter createGBKConverter(){
        return new GBKEncodingConverter();
    }

}
