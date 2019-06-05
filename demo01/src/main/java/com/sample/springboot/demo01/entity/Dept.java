package com.sample.springboot.demo01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

  @Id
  @Column(name="deptId")
  private String deptId;
  @Column(name="deptName")
  private String deptName;

}
