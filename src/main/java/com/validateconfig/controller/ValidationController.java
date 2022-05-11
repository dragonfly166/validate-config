package com.validateconfig.controller;

import com.validateconfig.config.DataConfig;
import com.validateconfig.config.DataConfig2;
import com.validateconfig.config.DataConfig3;
import com.validateconfig.config.DataConfig4;
import com.validateconfig.config.DataConfig5;
import com.validateconfig.domain.Student;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunlongfei
 */
@Slf4j
@Validated
@RestController
@RequestMapping("test")
public class ValidationController {

    @Autowired
    private DataConfig dataConfig;

    @Autowired
    private DataConfig2 dataConfig2;

    @Autowired
    private DataConfig3 dataConfig3;

    @Autowired
    private DataConfig4 dataConfig4;

    @Autowired
    private DataConfig5 dataConfig5;

    @GetMapping("/validation")
    public String validation(@NotBlank(message = "msg blank") String msg,
        @Min(0) Integer number,
        @Pattern(regexp = "(01)*") String reg,
        @Valid Student student) {
        log.info("msg:" + msg);
        log.info("number:" + number);
        log.info("reg:" + reg);
        log.info("student:" + student);
        return "success";
    }
    @GetMapping("/config")
    public String config() {
        System.out.println(dataConfig);
        System.out.println(dataConfig2);
        System.out.println(dataConfig3);
        System.out.println(dataConfig4);
        System.out.println(dataConfig5);
        return "success";
    }
}
