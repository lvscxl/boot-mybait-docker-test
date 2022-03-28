package com.zp.bootmybaitdockertest.user.mapper;


import com.zp.bootmybaitdockertest.user.entity.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//public interface SchoolMapper extends BaseMapper<School> {
public interface SchoolMapper  {

   List<School> getSchoolFromMapper();
}
