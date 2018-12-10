package com.example.ex.controller;

import com.example.ex.exception.BizException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    /**
     * 局部异常处理
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(BizException.class)
    public String exPage1(Exception ex, Model model) {
        model.addAttribute("ex", ex);

        return  "/error/biz.html";
    }

    @GetMapping("/e500")
    public String e500() {
        throw new RuntimeException("runtime-exception");
    }

    @GetMapping("/add")
    public String add() {
        throw new BizException("添加出现异常");
    }

}
