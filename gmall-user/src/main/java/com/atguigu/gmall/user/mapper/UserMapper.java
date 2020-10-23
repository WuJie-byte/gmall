package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.umsMembers;

import java.util.List;

public interface UserMapper {

    List<umsMembers> selectAllUser();
}
