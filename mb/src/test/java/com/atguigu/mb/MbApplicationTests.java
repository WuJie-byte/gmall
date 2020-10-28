package com.atguigu.mb;

import com.atguigu.mb.entity.EduTeacher;
import com.atguigu.mb.entity.User;
import com.atguigu.mb.mapper.EduTeacherMapper;
import com.atguigu.mb.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MbApplicationTests {

    @Autowired
    private EduTeacherMapper tm;

    @Test
    void getList() {

        List<EduTeacher> eduTeachers = tm.selectList(null);
        for (EduTeacher u: eduTeachers) {
            System.out.println(u);
        }

        System.out.println("===============");
        Page<EduTeacher> eduTeacherPage = new Page<>();
        eduTeacherPage.setSize(3);
        eduTeacherPage.setCurrent(1);
        /*IPage<EduTeacher> eduTeacherIPage = tm.selectPage(eduTeacherPage, null);
        List<EduTeacher> records = eduTeacherIPage.getRecords();
        long pages = eduTeacherIPage.getPages();

        for (EduTeacher e: records) {
            System.out.println(e.toString());
        }
        System.out.println("共"+pages+"页");*/

        Map<String, Object> stringObjectMap = new HashMap<>();

        stringObjectMap.put("123",eduTeacherPage);
        stringObjectMap.put("intro", 3);

        List<EduTeacher> eduTeachers1 = tm.listPage(stringObjectMap);
        for (EduTeacher e:eduTeachers1) {
            System.out.println(e);
        }
        /*List<EduTeacher> records = eduTeacherPage.getRecords();
        System.out.println("records");
        System.out.println("size:"+records.size());
        for (EduTeacher e: records
             ) {
            System.out.println(e);

        }*/
        System.out.println("第"+eduTeacherPage.getCurrent()+"页");
        System.out.println("每页条数："+eduTeacherPage.getSize());
        System.out.println("共"+eduTeacherPage.getPages()+"页");
    }

}
