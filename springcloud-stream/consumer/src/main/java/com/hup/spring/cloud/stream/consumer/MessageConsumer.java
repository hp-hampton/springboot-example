package com.hup.spring.cloud.stream.consumer;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author hupeng
 */
@EnableBinding(InputChannel.class)
public class MessageConsumer {
    /**
     * condition 满足某个条件才监听 simples:监听headers头里面带有flag == aa
     *
     * @param message
     */
    @StreamListener(value = InputChannel.REGISTER_INPUT, condition = "headers['flag'] == 'aa'")
    public void receive(Message<String> message) {
        System.out.println("接收到MQ消息:" + JSONObject.toJSONString(message));
    }
}
