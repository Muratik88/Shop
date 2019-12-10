package com.murat.kg.shop.controllers;

import com.murat.kg.shop.models.Person;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    public Person getPerson(){
        return new Person();
    }

}
