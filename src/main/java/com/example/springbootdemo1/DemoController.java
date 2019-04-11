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

    //张三新增方法
    public void zhangsan(){
        System.out.println("zhangsan");
    }

    //小牛团队，新增分支方法
    public void xiaoniu(){

        System.out.println("小牛你好");
    }

    //小牛团队，新增分支方法2
    public void xiaoniu2(){

        System.out.println("小牛你好2");
    }
}
