package com.example.mukedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: muke-demo
 * @description:
 * @author: qq
 * @create: 2022-11-25 20:40
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
