package com.validateconfig.config;

import javax.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author sunlongfei
 */
@Data
@Component
public class DataConfig3 {

    private String a;

    private String b;

    @Autowired
    private Environment environment;

    @PostConstruct
    public void init() {
        this.a = environment.getProperty("test.a");
        this.b = environment.getProperty("test.b");
    }
}
