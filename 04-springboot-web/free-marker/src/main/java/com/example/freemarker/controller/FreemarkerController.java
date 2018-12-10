package com.example.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FreemarkerController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/data")
    public String data(Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("name","这尼玛居然");
        map.put("age", 10);
        map.put("birth", new Date());
        model.addAttribute("user", map);

        return "index";
    }
}
