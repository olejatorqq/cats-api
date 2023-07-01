package com.example.catsapi.controller;

import com.example.catsapi.entity.Cat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
public class CatController {

    @PostMapping
    public Cat save(Cat cat){
        return cat;
    }

}
