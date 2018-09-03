package com.hup.springcloud.stream.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutputChannel {

    String REGISTER_OUTPUT = "register_output";

    String STATISTICS_OUTPUT = "statistics_output";

    String GROUP_CHANNEL = "group-channel";

    @Output(REGISTER_OUTPUT)
    MessageChannel registerOutput();

    @Output(STATISTICS_OUTPUT)
    MessageChannel statisticsOutput();

    @Output(GROUP_CHANNEL)
    MessageChannel groupOutput();

}
