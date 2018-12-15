package com.setsuna.clould.demo.microconsumer.controller;

import com.setsuna.clould.demo.microconsumer.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserWarpController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    // 写死访问api方式测试
    /*@GetMapping("/warp/user/{version}/{id}")
    public UserVo getUser(@PathVariable("version") double version, @PathVariable("id") Integer userId, String name) {
        System.out.println(version);
        System.out.println(name);
        // url必须是rest风格路径
        return restTemplate.getForObject("http://127.0.0.1:8080//user/"+userId, UserVo.class);
    }*/

    @GetMapping("warp/user/{id}")
    public UserVo getUser(@PathVariable("id") Integer userId) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("micro-provider");
        String host = serviceInstance.getHost(); // 主机名
        int port = serviceInstance.getPort(); // 端口号
        String url = String.format("http://%s:%s/%s/%d",host, port, "user", userId);
        System.out.println(url);
        // url必须是rest风格路径
        return restTemplate.getForObject(url, UserVo.class);
    }

    /*@GetMapping("warp/user/{id}")
    public UserVo getUser(@PathVariable("id") Integer userId) {
        // url必须是rest风格路径
        return restTemplate.getForObject("http://provider/user/"+userId, UserVo.class);
    }*/

}
