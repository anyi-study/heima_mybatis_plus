package com.laoou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laoou.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
