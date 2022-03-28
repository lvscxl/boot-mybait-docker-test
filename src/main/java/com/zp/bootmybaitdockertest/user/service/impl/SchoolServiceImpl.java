package com.zp.bootmybaitdockertest.user.service.impl;



import com.zp.bootmybaitdockertest.user.entity.School;
import com.zp.bootmybaitdockertest.user.mapper.SchoolMapper;
import com.zp.bootmybaitdockertest.user.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SchoolService")
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public List<School> getSchool() {
        return schoolMapper.getSchoolFromMapper();
    }
}
