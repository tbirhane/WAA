package edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdviceController {

    @GetMapping(value = "/roast")
    public String getAdvice(Model model){
        Map< String, String > roastMap = new HashMap<String, String>();

        roastMap.put("Light", "light");
        roastMap.put("Medium", "medium");
        roastMap.put("Dark", "dark");
        model.addAttribute("roasts", roastMap);
        return "advice";

    }
}
