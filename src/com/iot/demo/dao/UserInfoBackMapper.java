package com.iot.demo.dao;

import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.bean.UserInfoBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoBackMapper {
    int countByExample(UserInfoBackExample example);

    int deleteByExample(UserInfoBackExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfoBack record);

    int insertSelective(UserInfoBack record);

    List<UserInfoBack> selectByExample(UserInfoBackExample example);

    UserInfoBack selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserInfoBack record, @Param("example") UserInfoBackExample example);

    int updateByExample(@Param("record") UserInfoBack record, @Param("example") UserInfoBackExample example);

    int updateByPrimaryKeySelective(UserInfoBack record);

    int updateByPrimaryKey(UserInfoBack record);
}