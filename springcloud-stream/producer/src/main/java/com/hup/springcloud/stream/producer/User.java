package com.hup.springcloud.stream.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hupeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;

    private Integer age;
}
