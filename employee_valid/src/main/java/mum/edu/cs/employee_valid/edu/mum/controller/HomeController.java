package mum.edu.cs.employee_valid.edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/welcome"}, method = RequestMethod.GET)
	public String welcome() {
 
		return "welcome";
	}
	
 }
