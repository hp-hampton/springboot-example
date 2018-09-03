package com.hup.springcloud.stream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hupeng
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping
    public void test() {
        messageProducer.sendMail();
        messageProducer.reportedData();
    }

}
