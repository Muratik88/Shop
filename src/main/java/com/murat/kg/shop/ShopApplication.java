package com.murat.kg.shop;

import com.murat.kg.shop.models.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {

        Person person = new Person(1,1,"Murat");

        SpringApplication.run(ShopApplication.class, args);
    }

}
