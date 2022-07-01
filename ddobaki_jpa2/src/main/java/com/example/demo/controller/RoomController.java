package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.RoomService;

import lombok.Setter;

@Controller
@Setter
public class RoomController {
	@Autowired
	private RoomService rs;
	
//	@GetMapping("/listPlaceAndRoom")
//	public void list(Model model) {
//		model.addAttribute("list", rs.placeAndRoom());
//	}

}
