package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.PlanService;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.UserInfo;

import lombok.Setter;

@Controller
@Setter
public class UserInfoController {
	@Autowired
	private UserInfoService uis;
	
	@Autowired
	private PlanService plan;

	@GetMapping("/listUser")
	@ResponseBody
	public List<UserInfo> findAll(){
		return uis.findAll();
	}
	
	@ResponseBody
	@GetMapping("/getUser/{user_num}")
	public UserInfo getUser(@PathVariable int user_num) {
		 UserInfo userInfo = uis.getUser(user_num);
		 return userInfo;
		 //return "redirect:/insertPlan";
	}
	
	
}