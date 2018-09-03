package com.hup.springboot.event.controller;

import com.hup.springboot.event.model.User;
import com.hup.springboot.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hupeng
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void register() {
        User user = new User();
        user.setUsername("大鹏");
        user.setPassword("123456");
        userService.register(user);
    }
}
