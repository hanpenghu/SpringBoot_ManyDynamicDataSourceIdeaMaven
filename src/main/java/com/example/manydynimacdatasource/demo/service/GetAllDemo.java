package com.example.manydynimacdatasource.demo.service;

import com.example.manydynimacdatasource.demo.dao.DemoMapper;
import com.example.manydynimacdatasource.demo.dto.Demo;
import com.example.manydynimacdatasource.demo.dto.DemoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllDemo {
    @Autowired
    DemoMapper demoMapper;

    public List<Demo> getAllDemo(){
        DemoExample de = new DemoExample();
        de.createCriteria().andIdIsNotNull();
        return demoMapper.selectByExample(de);
    }

}
