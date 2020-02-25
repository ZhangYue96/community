package com.bean.community.mapper;

import com.bean.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {

    @Insert("insert into user(account_id, name, token, gmt_create, gmt_modified)values (#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified})")
    public void insertAccount(User user);

}