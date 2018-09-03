package com.hup.springcloud.customer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputChannel {

    String REGISTER_INPUT = "register_input";

    String STATISTICS_INPUT = "statistics_input";

    @Input(REGISTER_INPUT)
    SubscribableChannel registerEmail();

    @Input(STATISTICS_INPUT)
    SubscribableChannel reportedData();

    String GROUP_CHANNEL = "group-channel";

    @Input(GROUP_CHANNEL)
    SubscribableChannel groupInput();
}
