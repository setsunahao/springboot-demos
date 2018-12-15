package com.example.redis;

import com.alibaba.fastjson.JSON;
import com.example.redis.domain.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RedisApplication.class, args);

        //取出redisTemplate的
        Map<String, RedisTemplate> beansOfType = context.getBeansOfType(RedisTemplate.class);

        System.out.println(beansOfType);
        System.out.println("------------------------------------");

        //取出redisTemplate
        RedisTemplate redisTemplate = context.getBean("stringRedisTemplate", RedisTemplate.class);

        redisTemplate.opsForValue().set("test", "test-value");

        //1.使用json进行序列化
        /*Order order = new Order();
        order.setOrderId(10001);
        order.setOrderName("商品订单");
        redisTemplate.opsForValue().set("order-1", JSON.toJSONString(order));*/

        //2.通过配置jackson的序列化器操作
        /*Order order = new Order();
        order.setOrderId(10002);
        order.setOrderName("商品订单");
        RedisTemplate myRedisTemplate = context.getBean("myRedisTemplate", RedisTemplate.class);
        myRedisTemplate.opsForValue().set("order-2", order);*/

        //3.使用 defaultRedisTemplate
        Order order = new Order();
        order.setOrderId(10003);
        order.setOrderName("商品订单");
        RedisTemplate defaultRedisTemplate = context.getBean("defaultRedisTemplate", RedisTemplate.class);
        defaultRedisTemplate.opsForValue().set("order-3", order);
        Order resultOrder = (Order) defaultRedisTemplate.opsForValue().get("order-3");
        System.out.println(resultOrder.toString());
    }

}

