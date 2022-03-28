package com.zp.bootmybaitdockertest.user.entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class School {

    private String id;
    private String schoolName;
    private Integer status;
    private LocalDateTime createTime;
    private String userId;
}
