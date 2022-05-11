package com.validateconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunlongfei
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "test")
public class DataConfig {

    private String a;

    private String b;
}
