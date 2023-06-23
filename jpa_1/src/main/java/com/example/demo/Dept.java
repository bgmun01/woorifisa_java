package com.example.demo;

import java.util.List;

import com.example.demo.model.entity.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder // 생성자 패턴 쓰는게 편리?
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long deptId;
	private String deptName;
	
	
	@OneToMany(mappedBy = "dept") // 그쪽에서 부르는 이름까지 설정
	List <Employee> emps; // emp와 관계를 나타냄 


	
}
