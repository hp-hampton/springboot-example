package com.hup.spring.cloud.stream.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputChannel {

    String REGISTER_INPUT = "register_input";

    String STATISTICS_INPUT = "statistics_input";

    @Input(REGISTER_INPUT)
    SubscribableChannel registerInput();

    @Input(STATISTICS_INPUT)
    SubscribableChannel statisticsInput();
}
