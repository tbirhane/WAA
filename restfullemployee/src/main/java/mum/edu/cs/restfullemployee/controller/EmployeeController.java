package mum.edu.cs.restfullemployee.controller;


import mum.edu.cs.restfullemployee.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String displayForm(@ModelAttribute Employee employee){
        return "employeeForm";
    }
    @PostMapping(value = "/addEmployee", produces = "application/json")
    public @ResponseBody Employee save(@RequestBody Employee employee){
        System.out.println("Hi");
        return employee;
    }
}
