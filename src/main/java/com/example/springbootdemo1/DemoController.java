package com.example.springbootdemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello JAVA1105!";
    }
//新增方法
    public void addMethod1(){
        System.out.println("this is a method");
    }
}
