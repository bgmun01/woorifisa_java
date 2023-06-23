package com.example.demo.model.entity;

import java.time.LocalDateTime;

import com.example.demo.Dept;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 1. java beans 규약이 필요하다 !!
// - 모든 member는 private
// - getter/setter, default constructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // 테이블과 매핑해야해요~~
public class Employee {
	//P.K 지정
	@Id // P.K 로 동작하는 녀석
	@GeneratedValue(strategy = GenerationType.IDENTITY)// IDENTITY Auto- increment
	private long empNo;
	private String name;
	private int age;
	private	char gender;
	private long managerNo;
	private LocalDateTime hireDate;
	
	//관계를 줘볼거에유
	@ManyToOne(optional = false) // 여러 employee 가 하나의 dept와 관계를 맺는다. join 한다.
	@JoinColumn(name= "dept_dept_id") // join에 사용되는 컬럼
	private Dept dept;
}
