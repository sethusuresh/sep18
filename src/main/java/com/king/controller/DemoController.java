package com.king.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class DemoController {
 
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		//use weatherman api
		System.out.println("New build");
		return "welcome";
	}
}