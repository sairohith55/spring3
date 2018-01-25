package com.ts.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDAO;

public class MyUrbanSpoonService {

	@Autowired
	UserDAO udao;
	
	
	public void addUser(HttpServletRequest request, HttpServletResponse response){
		System.out.println("adduser");
		
		
		
	}
	
	
	

}
