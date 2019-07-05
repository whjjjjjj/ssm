package com.hj.service;

import com.hj.dao.DeptDao;
import com.hj.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/4/30.
 */

@Service("deptService")
public class DeptServiceImpl implements IDeptService{
    @Resource
    private DeptDao deptDao;


    @Override
    public int insertDept(Dept dept) {
        return deptDao.insertDept(dept);
    }
}
