package com.hj.controller;

import com.hj.dao.DeptDao;
import com.hj.domain.Dept;
import com.hj.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/4/30.
 */
@Controller
@RequestMapping(value = "/dept")
public class DeptAction {

    @Autowired
    private IDeptService deptService;

    @RequestMapping(value = "/insert")
    public String insert(Dept dept){
        System.out.println("--action.dept:"+dept);
        deptService.insertDept(dept);
        return "/main";
    }
}
