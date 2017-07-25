package com.example.manydynimacdatasource.demo.service;

import com.example.manydynimacdatasource.demo.component.DataSourceConfig.TargetDataSource;
import com.example.manydynimacdatasource.demo.dao.AspnetMembersMapper;
import com.example.manydynimacdatasource.demo.dto.AspnetMembers;
import com.example.manydynimacdatasource.demo.dto.AspnetMembersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllAspnetMembers {
    @Autowired
    private AspnetMembersMapper aspnetMembersMapper;

    @TargetDataSource(name="ds1")
    public List<AspnetMembers> getAllAspnetMembers(){
        AspnetMembersExample ame=new AspnetMembersExample();
        ame.createCriteria().andUseridIsNotNull();
        List<AspnetMembers> aspnetMembers = aspnetMembersMapper.selectByExample(ame);
        return aspnetMembers;
    }

}
