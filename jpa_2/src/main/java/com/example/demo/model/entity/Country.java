package com.example.demo.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Country {
	@Id
	@Column(columnDefinition = "char(3) NOT NULL DEFAULT ")
	private String code;
	@Column(columnDefinition = "char(52) NOT NULL DEFAULT")
	private String name;
	@Column(columnDefinition = "char(26) NOT NULL DEFAULT")
	private String region;
	@Column(columnDefinition = "decimal(10,2) NOT NULL DEFAULT '0.00'")
	private double surfacearea;
	@Column(columnDefinition = "smallint DEFAULT NULL")
	private Integer indepyear;
	private Integer population;
	//private double lifeExpectancy;
	@Column(columnDefinition = "decimal(10,2) DEFAULT NULL")
	private Double gnp;
	@Column(name = "GNPOld", columnDefinition = "decimal(10,2) DEFAULT NULL")
	private Double gnpOld;
	@Column(columnDefinition = "char(45) NOT NULL DEFAULT")
	private String localname;
	
	//@Column(name = "GovernmentForm", columnDefinition = "char(45) NOT NULL DEFAULT")
	//private String governmentForm;
	
	//@Column(name="HeadOfState", columnDefinition = "char(60) DEFAULT NULL")
	//private String headOfState;
	private int capital;
	@Column(columnDefinition = "char(2) NOT NULL DEFAULT")
	private String code2;

	@OneToMany(mappedBy = "countrycode")
	
	List<City> cities;
}
