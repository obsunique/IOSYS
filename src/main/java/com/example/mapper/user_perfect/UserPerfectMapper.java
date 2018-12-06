package com.example.mapper.user_perfect;

import com.example.pojo.UserPerfect;
import com.example.pojo.UserPerfectExample;
import com.example.pojo.UserPerfectWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPerfectMapper {
    int countByExample(UserPerfectExample example);

    int deleteByExample(UserPerfectExample example);

    int insert(UserPerfectWithBLOBs record);

    int insertSelective(UserPerfectWithBLOBs record);

    List<UserPerfectWithBLOBs> selectByExampleWithBLOBs(UserPerfectExample example);

    List<UserPerfect> selectByExample(UserPerfectExample example);

    int updateByExampleSelective(@Param("record") UserPerfectWithBLOBs record, @Param("example") UserPerfectExample example);

    int updateByExampleWithBLOBs(@Param("record") UserPerfectWithBLOBs record, @Param("example") UserPerfectExample example);

    int updateByExample(@Param("record") UserPerfect record, @Param("example") UserPerfectExample example);
}