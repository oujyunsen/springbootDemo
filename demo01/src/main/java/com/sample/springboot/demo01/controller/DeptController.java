package com.sample.springboot.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.demo01.entity.Dept;
import com.sample.springboot.demo01.service.DeptService;

@RestController
public class DeptController {

  @Autowired
  DeptService deptService;

  @RequestMapping(value="/dept/{deptId}", method=RequestMethod.GET)
  public Dept getDeptById(@PathVariable("deptId") String id) {
    return deptService.getDeptByDeptId(id);
  }

  @RequestMapping(value="/dept", method=RequestMethod.POST)
  public Dept insertDept(@RequestParam String deptId, @RequestParam String deptName){
    return deptService.saveDept(deptId, deptName);
  }

  @RequestMapping(value="/dept2", method=RequestMethod.POST)
  public Dept insertDept(@RequestBody Dept dept){
      return deptService.saveDept(dept);
  }

  @RequestMapping(value="/dept/{deptId}", method=RequestMethod.PUT)
  public Dept updateDept(@PathVariable("deptId") String deptId, @RequestBody Dept dept) {
    dept.setDeptId(deptId);
    return deptService.updateDept(dept);
  }

}
