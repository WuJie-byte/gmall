package com.atguigu.mb.mapper;

import com.atguigu.mb.entity.EduTeacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

public interface EduTeacherMapper extends BaseMapper<EduTeacher> {

    List<EduTeacher> listPage(Map<String, Object> map);
}
