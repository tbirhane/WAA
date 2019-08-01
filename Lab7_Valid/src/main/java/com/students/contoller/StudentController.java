package com.students.contoller;

import com.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.students.domain.Student;

import javax.validation.Valid;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/registration",method=RequestMethod.GET)	
	    public String showForm(@ModelAttribute("student") Student student, Model model){
	    	
 	        return "registration";
	    }
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)	
	    public String processForm(@ModelAttribute("student") Student student, BindingResult bindingResult, Model model){
 			if(bindingResult.hasErrors()){
 				return "registration";
			}
		studentService.save(student);
             return "redirect:/success";
 
	
	    }
	    @GetMapping("/success")
	    public String displayStudent(){

		return "success";
		}

	    
	}

	

