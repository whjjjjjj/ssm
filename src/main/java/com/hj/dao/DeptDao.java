package com.hj.dao;

import com.hj.domain.Dept;

/**
 * Created by Administrator on 2019/4/30.
 */
public interface DeptDao {
    public Dept selectDept(Integer deptId);
    public int insertDept(Dept dept);
}
