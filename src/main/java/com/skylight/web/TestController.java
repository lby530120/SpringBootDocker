package com.skylight.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangbin on 2017/7/7.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World. this is my first use docker to start web";
    }
}
