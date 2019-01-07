package com.mengze.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;

@Data
@NoArgsConstructor
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
        System.out.println("调用dog构造函数。。。");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化方法");
    }

    public void bark() {
        System.out.println(name + " barking ...");
    }
}
