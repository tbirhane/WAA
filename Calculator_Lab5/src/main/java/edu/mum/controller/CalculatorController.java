package edu.mum.controller;

import edu.mum.domain.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import edu.mum.service.CalculatorValidator;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;

@Controller
//@SessionAttributes({"calculator","result","message"})
public class CalculatorController {

    @Autowired
    private CalculatorValidator calculatorValidator;

    @GetMapping(value = {"/","/calculator"})
    public String showCalculator(){
        System.out.println("hi");
        return "calculator";
    }

    @PostMapping(value = "/calculate")
    public String result(Calculator calculator, Model model, RedirectAttributes redirectAttributes){
        List<String> errors = calculatorValidator.validate(calculator);
        if(errors.isEmpty()){
            redirectAttributes.addFlashAttribute("calculator",calculator);
            redirectAttributes.addFlashAttribute("result",calculator.calculate());
            redirectAttributes.addFlashAttribute("message","Thank you for using our service!");

            return "redirect:/showresult";
//            return "result";
        }else {
            model.addAttribute("errors", errors);
            model.addAttribute("form", calculator);
            return "calculator";
        }
    }
    @GetMapping(value = "/showresult")
    public String showResult(SessionStatus status){
//        status.setComplete();
        return "result";
    }

}
