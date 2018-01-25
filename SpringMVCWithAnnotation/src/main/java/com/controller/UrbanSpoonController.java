package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.service.MyUrbanSpoonService;

@Controller
@RequestMapping("/UrbanSpoonController")	
public class UrbanSpoonController  {
	
	@Autowired
	MyUrbanSpoonService service;
	
	@RequestMapping(value="/urf",method=RequestMethod.POST)
	public ModelAndView userRegisteForm(HttpServletRequest request,HttpServletResponse response){
		//System.out.println(user.toString());
		String action=request.getParameter("action");
		System.out.println(service);
		if(action!=null){
			if(action.equalsIgnoreCase("user_registration")){
				service.addUser(request,response);
			}
		}
		ModelAndView mv=new ModelAndView("success","message","welcome to home page:");
		return mv;
	}
	
	
}