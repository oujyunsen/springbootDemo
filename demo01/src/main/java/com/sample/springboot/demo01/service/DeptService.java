package com.sample.springboot.demo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.springboot.demo01.entity.Dept;
import com.sample.springboot.demo01.repository.DeptRepository;

@Service
public class DeptService {

  @Autowired
  private DeptRepository deptRepository;


  public Dept getDeptByDeptId(String deptId) {
    return deptRepository.findByDeptId(deptId);
  }

  public Dept saveDept(String deptId, String deptName) {
    return deptRepository.save(new Dept(deptId, deptName));
  }

  public Dept saveDept(Dept dept) {
    return deptRepository.save(dept);
  }

  public Dept updateDept(Dept dept) {
    return deptRepository.save(dept);
  }

}
