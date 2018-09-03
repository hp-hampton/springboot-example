package com.hup.springboot.event.service.impl;

import com.hup.springboot.event.UserRegisterEvent;
import com.hup.springboot.event.model.User;
import com.hup.springboot.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author hupeng
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void register(User user) {
        System.out.println(user.getUsername() + "注册成功了！");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, user.getUsername()));
    }
}
