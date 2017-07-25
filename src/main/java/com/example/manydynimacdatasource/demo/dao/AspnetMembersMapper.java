package com.example.manydynimacdatasource.demo.dao;

import java.util.List;
import com.example.manydynimacdatasource.demo.dto.AspnetMembers;
import com.example.manydynimacdatasource.demo.dto.AspnetMembersExample;
import org.apache.ibatis.annotations.Param;

public interface AspnetMembersMapper {
    long countByExample(AspnetMembersExample example);

    int deleteByExample(AspnetMembersExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(AspnetMembers record);

    int insertSelective(AspnetMembers record);

    List<AspnetMembers> selectByExample(AspnetMembersExample example);

    AspnetMembers selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") AspnetMembers record, @Param("example") AspnetMembersExample example);

    int updateByExample(@Param("record") AspnetMembers record, @Param("example") AspnetMembersExample example);

    int updateByPrimaryKeySelective(AspnetMembers record);

    int updateByPrimaryKey(AspnetMembers record);
}