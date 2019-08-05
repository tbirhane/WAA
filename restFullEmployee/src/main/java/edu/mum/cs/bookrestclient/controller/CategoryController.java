package edu.mum.cs.bookrestclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
	
	@GetMapping("/category")
	public String getCategoryForm() {
		return "category";
	}
	
}
