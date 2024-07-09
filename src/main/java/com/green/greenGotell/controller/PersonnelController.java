package com.green.greenGotell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PersonnelController {
	
	@GetMapping("/personnel")
	public String list() {
		return "/views/personnel/list";
	}
	
	@GetMapping("/personnel/write")
	public String write() {
		return "/views/personnel/write";
	}
	
	

}
