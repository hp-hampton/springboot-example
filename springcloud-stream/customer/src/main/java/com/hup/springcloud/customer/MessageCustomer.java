package com.hup.springcloud.customer;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hupeng
 */
@EnableBinding(InputChannel.class)
public class MessageCustomer {
    /**
     * condition 满足某个条件才监听 simples:监听headers头里面带有flag == aa
     * , condition = "headers['flag'] == 'aa'"
     *
     * @param message
     */
    @StreamListener(value = InputChannel.REGISTER_INPUT)
    public void receive1(Message<String> message) {
        System.out.println("接收到大鹏a消息:" + JSONObject.toJSONString(message));
    }

    @StreamListener(value = InputChannel.STATISTICS_INPUT, condition = "headers['flag'] == 'bb'")
    public void receive2(Message<String> message) {
        System.out.println("接收到大鹏b消息:" + JSONObject.toJSONString(message));
    }

    @StreamListener(value = InputChannel.GROUP_CHANNEL)
    public void receive3(Message<String> message) {
        System.out.println("接收到大鹏c消息:" + JSONObject.toJSONString(message));
    }


    public static void main(String[] args) {
        String s = new Date().toString();
        System.out.println(s);
    }

}
