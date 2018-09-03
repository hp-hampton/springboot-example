package com.hup.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author hupeng
 */
@Component
public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        String msg = event.getMessage();
        System.out.println("接收到了消息：" + msg);
    }
}
