package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ThymeleafController {


    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/data")
    public String date(Model model){
        Map<String, Object> map = new HashMap<>();
        map.put("name","这尼玛居然");
        map.put("age", 10);
        model.addAttribute("user", map);

        return "index";
    }

}
