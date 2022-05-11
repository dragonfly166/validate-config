package com.validateconfig.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 * @author sunlongfei
 */
@Data
public class Student {

    @NotBlank(message = "id blank")
    private String id;

    @Pattern(regexp = "[\\w\\u4e00-\\u9fcc]+")
    private String name;

    @Min(0)
    private Integer age;

    @NotNull(message = "status null")
    private Boolean status;
}
