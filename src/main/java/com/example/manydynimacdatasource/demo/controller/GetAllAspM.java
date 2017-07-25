package com.example.manydynimacdatasource.demo.controller;

import com.example.manydynimacdatasource.demo.dto.AspnetMembers;
import com.example.manydynimacdatasource.demo.service.GetAllAspnetMembers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class GetAllAspM {

    @Autowired
    private GetAllAspnetMembers getAllAspnetMembers;

   @RequestMapping(value="f",method = RequestMethod.GET)
    public List<AspnetMembers> f(){
        return getAllAspnetMembers.getAllAspnetMembers();
    }
}
