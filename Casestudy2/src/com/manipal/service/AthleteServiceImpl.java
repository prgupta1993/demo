package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.beans.Athlete;
import com.manipal.dao.AthleteDAO;
import com.manipal.dao.AthleteJdbcDao;

public class AthleteServiceImpl implements AthleteService{

	@Autowired
	AthleteDAO edao;

	 public AthleteServiceImpl() {
		this.edao = new AthleteJdbcDao();
	}


	@Override
	public String addEmployee(Athlete e) {
      int[] r=new int[2];
		r=edao.insert(e);
		String msg=null;
		if(r[1]==1)
		{
			msg="Athlete added Successfully and  the Athlete ID is "+r[0];
		}
		else
		{
			msg="Sorry.Try Again!! Row not added properly";
		}
		return msg;
	}


	@Override
	public List<Athlete> getAll() {

		List<Athlete> list=edao.listAll();
		for(Athlete e:list)
			System.out.println(e);
		return list;
		

	}

	
	@Override
	public String removeEmployee(String name) {
		// TODO Auto-generated method stub
		int r = edao.delete(name);
		String msg=null;
		if(r==1){
			msg = "Row removed Successfully...";
		}
		else {
			msg = "Row not removed!!!!!";
		}
		return msg;
	}



	@Override
	public String updateEmployee(String na, String em, String mo) {
		// TODO Auto-generated method stub
		int r = edao.update(na,em,mo);
		String msg = null;
		if(r==1){
			msg = "Row Update Successfully...";
		}
		else {
			msg = "Row not Updatedd!!!!!";
		}
		return msg;
		
	}

}
