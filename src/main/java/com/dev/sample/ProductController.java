package com.dev.sample;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProductController {


    @GetMapping("/products")
    public List<NewProduct> getMethodName() {
        System.out.println("git commit test and publish to central repo github, Lets go");
        return Arrays.asList(
            new NewProduct(1,"Honda", "2024",45550.00),
            new NewProduct(2,"Honda CRV", "2024",45550.00));

    }
    
}
