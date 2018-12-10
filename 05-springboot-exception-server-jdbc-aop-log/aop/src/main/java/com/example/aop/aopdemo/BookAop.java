package com.example.aop.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class BookAop {

    // 定义切入点
    public static final String POINT_CUT = "execution(* com.example.aop.dao..*.*(..))";

    @Before(POINT_CUT)
    public void before() {
        System.out.println("添加图书方法校验前.....");
    }

    @After(POINT_CUT)
    public void after(JoinPoint jp) {
        /// System.out.println(AopContext.currentProxy());
       /* System.out.println(jp.getTarget().getClass());
        System.out.println(Arrays.asList(jp.getArgs()));*/
        System.out.println("添加图书成功后.....");
    }
}
