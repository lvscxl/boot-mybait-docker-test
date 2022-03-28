package com.zp.bootmybaitdockertest.user.controller;

import com.zp.bootmybaitdockertest.user.entity.School;
import com.zp.bootmybaitdockertest.user.service.SchoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {


    @Resource
    SchoolService schoolService;

    @GetMapping("getUser")
    public String getUSer(String uid) {

        System.out.println(" uid =" + uid);
        return uid;
    }

    @GetMapping("getSchoolList")
    public String getSchoolLista(String uid) {
        List<School> school = schoolService.getSchool();
        for (School school1 : school) {
            System.out.println("school: =" + school.toString());
        }
        System.out.println(" uid =" + uid);
        return uid;
    }
}
