package com.example.demo.model.entity;

import com.example.demo.model.dto.CityDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(columnDefinition = "char(35) NOT NULL DEFAULT")
	private String name;
	@Column(columnDefinition = "char(20) NOT NULL DEFAULT")
	private String district;
	private long population;
	
	
	//연관 객체의 로딩 시점을 필요한 시점으로 한다.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="countrycode")
	
	private Country countrycode;
	// Entity는 Service 뒤쪽에서만, Service 앞쪽은 Dto로 사용
	public CityDto toDto() {
		CityDto dto = new CityDto();
		dto.setId(this.getId());
		dto.setName(this.getName());
		dto.setDistrict(this.getDistrict());
		dto.setPopulation(this.getPopulation());
		dto.setCountryCode(this.countrycode.getCode());
		return dto;
	}
}
