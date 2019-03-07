package com.cloud.ribbon.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "hello,I am ribbon-provider->"; // 提供一个hello World
    }
}
