package com.hup.springboot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hupeng on 2018/10/29
 * @version 1.0
 * @Description
 */
@RestController
@RequestMapping("/api/security")
public class SecurityController {

    @GetMapping
    public String getHello() {
        return "hello";
    }
}
