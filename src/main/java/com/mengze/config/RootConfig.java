package com.mengze.config;

import com.mengze.bpp.SimpleBeanPostProcessor;
import com.mengze.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.mengze"})
public class RootConfig {

    @Bean
    public Dog dhp() {
        return new Dog("dhp");
    }

    @Bean
    public SimpleBeanPostProcessor simpleBpp() {
        return new SimpleBeanPostProcessor();
    }


}
