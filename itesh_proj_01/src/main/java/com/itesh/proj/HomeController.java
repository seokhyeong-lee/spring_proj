package com.itesh.proj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello, Home String. ";
	}
	
	@RequestMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("name", "Hello, Home Page. ");
		return "home";
	}
}
