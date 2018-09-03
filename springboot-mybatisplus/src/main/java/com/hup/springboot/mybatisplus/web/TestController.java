package com.hup.springboot.mybatisplus.web;

import com.hup.springboot.mybatisplus.dao.domain.Test;
import com.hup.springboot.mybatisplus.dao.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hupeng
 * @version 1.0
 * @Date 2018/9/3 下午2:10
 */
@RequestMapping("/api")
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping
    public String getString() {
        Test test = testMapper.selectByPrimaryKey(1L);
        return "succuss";
    }
}
