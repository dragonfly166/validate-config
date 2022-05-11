package com.validateconfig.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunlongfei
 */
@Data
@Configuration
public class DataConfig2 {

    @Value("${test.id}")
    private String id;
    @Value("${test.name}")
    private String name;
}
