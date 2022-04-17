package com.company.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class UserDto {


    /**
     * 姓名
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phoneNum;


}