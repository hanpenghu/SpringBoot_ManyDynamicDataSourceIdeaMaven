package com.example.manydynimacdatasource.demo.controller;

import com.example.manydynimacdatasource.demo.dto.Demo;
import com.example.manydynimacdatasource.demo.service.GetAllDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllDemoC {
    @Autowired
    private GetAllDemo getAllDemo;
    @RequestMapping(value="g",method = RequestMethod.GET)
    public List<Demo> g(){
        return getAllDemo.getAllDemo();
    }

}
