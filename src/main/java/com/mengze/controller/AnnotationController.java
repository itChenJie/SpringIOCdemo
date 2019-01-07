package com.mengze.controller;

import com.mengze.entity.Dog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@RequestMapping("/annotation")
@SessionAttributes("dog")
public class AnnotationController {

    @RequestMapping("/session")
    public String sessionTest(@SessionAttribute("dog") Dog dog) {
        return dog.toString();
    }
}
