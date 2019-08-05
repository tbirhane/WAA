package edu.mum.cs.bookrestclient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmployeeController {
	
 @GetMapping("/")
    public String showForm(){return "employeeForm";}
	
	
}
