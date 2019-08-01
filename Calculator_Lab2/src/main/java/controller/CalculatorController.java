package controller;

import domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import validator.CalculatorValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CalculatorController {

    @AutoWired
    private CalculatorValidator calculatorValidator;
    @RequestMapping(value = {"/","/calculator"})
    public String showCalculator(HttpServletRequest request, HttpServletResponse response){
        return "/WEB-INF/calculator.jsp";
    }
    @RequestMapping(value = "/calculate")
    public String result(Calculator calculator, HttpServletRequest request, HttpServletResponse response){
        List<String> errors = calculatorValidator.validate(calculator);
        if(errors.isEmpty()){
            request.setAttribute("calculator",calculator);
            request.setAttribute("result",calculator.calculate());
            return "WEB-INF/result.jsp";
        }else {
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculator);
            return "/WEB-INF/calculator.jsp";
        }
    }

}
