package com.example.demo.bean;

import java.util.Calendar;

public interface Simplebean {
	public void setName(String name);
	public String getName(); 
	
	public void setNow(Calendar cal);
	public Calendar getNow();

}
