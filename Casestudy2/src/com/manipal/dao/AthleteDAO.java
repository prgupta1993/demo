package com.manipal.dao;

import java.util.List;

import com.manipal.beans.Athlete;


public interface AthleteDAO {

	public int[] insert(Athlete a);
	public List<Athlete> listAll();
	public int delete (String name);
	public int update(String em , String mo, String na); 
	
}
