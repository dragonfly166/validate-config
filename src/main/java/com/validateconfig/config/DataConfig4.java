package com.validateconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author sunlongfei
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "data")
public class DataConfig4 {

    private String pub;

    private String pri;
}
