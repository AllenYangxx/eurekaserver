package com.example.serviceprovider1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value="test1")
    public String test1(){
        return "test1";
    }
}
