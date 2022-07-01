package com.example.demo.controller;


import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.PlaceSearchCondition;


@Controller
public class PlaceController{
	
	@ResponseBody
	@GetMapping("/test") 
	public String test(PlaceSearchCondition param){ 
		
//		condition.setPlace_region_num(lastIndexOf(param));
//		condition.setPlace_type_num(param.getPlace_type_num());
//		condition.setPlace_park(param.getPlace_park());
//		condition.setPlace_spa(param.getPlace_spa());
//		condition.setPlace_meal(param.getPlace_meal());
//		condition.setPlace_weight(param.getPlace_weight());
//		condition.setPlace_array(param.getPlace_array());
//		condition.setPlace_name(param.getPlace_name());
		
		
//		return condition.toString();
		return ""+param;
		
	}
	
	
}
