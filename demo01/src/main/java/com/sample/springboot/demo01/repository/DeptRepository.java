package com.sample.springboot.demo01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.springboot.demo01.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {

  public Dept findByDeptId(String deptId);

  public Dept findByDeptName(String deptName);


}
