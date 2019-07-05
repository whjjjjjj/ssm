package com.hj.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/4/30.
 */
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;
    private String deptAddress;

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptAddress='" + deptAddress + '\'' +
                '}';
    }
}
