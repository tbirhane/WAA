package edu.mum.controller;

import edu.mum.domain.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.mum.service.CalculatorValidator;


import java.util.List;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorValidator calculatorValidator;

    @GetMapping(value = {"/","/calculator"})
    public String showCalculator(){
        System.out.println("hi");
        return "calculator";
    }

    @PostMapping(value = "/calculate")
    public String result(Calculator calculator, Model model){
        List<String> errors = calculatorValidator.validate(calculator);
        if(errors.isEmpty()){
            model.addAttribute("calculator",calculator);
            model.addAttribute("result",calculator.calculate());
            return "result";
        }else {
            model.addAttribute("errors", errors);
            model.addAttribute("form", calculator);
            return "calculator";
        }
    }

}
