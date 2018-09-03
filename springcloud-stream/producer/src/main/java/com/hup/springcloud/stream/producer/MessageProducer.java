package com.hup.springcloud.stream.producer;

import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author hupeng
 */
//@EnableBinding(Source.class);
@EnableBinding(OutputChannel.class)
public class MessageProducer {


    private static int count = 0;


    @Autowired
    //@Output(Source.OUTPUT)
    private OutputChannel outputChannel;

    public void sendMail() {

        outputChannel.registerOutput().send(MessageBuilder.withPayload(new User("胡鹏", 10))
                .setHeader("flag", "aa")
                .build());
    }


    public void reportedData() {

        outputChannel.statisticsOutput().send(MessageBuilder.withPayload("hello world")
                .setHeader("flag", "bb")
                .build());

    }

    @Bean
    @InboundChannelAdapter(value = OutputChannel.GROUP_CHANNEL, poller = @Poller(fixedRate = "5000", maxMessagesPerPoll = "1"))
    public MessageSource groupMessageSource() {
        return () -> {
            count++;
            System.out.println(OutputChannel.GROUP_CHANNEL+"消息"+count);
            return new GenericMessage<>(count);
        };
    }

    @Bean
    @InboundChannelAdapter(value = OutputChannel.REGISTER_OUTPUT, poller = @Poller(fixedRate = "5000", maxMessagesPerPoll = "1"))
    public MessageSource timerMessageSource() {
        return () -> {
            count++;
            System.out.println(OutputChannel.REGISTER_OUTPUT+"消息"+count);
            return new GenericMessage<>(new User("HUP", count));
        };
    }
}
