package com.validateconfig;

import com.validateconfig.config.DataConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidateConfigApplicationTests {

    @Autowired
    private DataConfig dataConfig;

    @Test
    void contextLoads() {
    }

    @Test
    void testData() {
        System.out.println(dataConfig);
    }

}
