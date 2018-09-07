package com.manipal.service;

import java.util.List;

import com.manipal.beans.Athlete;



public interface AthleteService {

	
	public String addEmployee(Athlete e);
	public List<Athlete> getAll();
	public String removeEmployee(String name);
	public String updateEmployee(String name,String email,String mobile);

}
