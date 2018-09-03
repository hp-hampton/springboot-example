package com.hup.springboot.event;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author hupeng
 * 定义事件
 */
@Data
public class UserRegisterEvent extends ApplicationEvent {

    private String message;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public UserRegisterEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

}
