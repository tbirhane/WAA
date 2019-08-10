package mum.edu.cs.persistence.controller;

import mum.edu.cs.persistence.model.Employee;
import mum.edu.cs.persistence.model.Role;
import mum.edu.cs.persistence.service.EmployeeService;
import mum.edu.cs.persistence.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private RoleService roleService;

    @ModelAttribute("roles")
    public List<Role> getRoles(Model model) {
        return roleService.findAll();
    }

    @GetMapping("/")
    public String display(@ModelAttribute Employee employee){
        return "employeeForm";
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@Valid Employee employee, Model model, RedirectAttributes redirectAttributes){
//        employeeService.save(employee);
//        model.addAttribute("employee", employeeService.save(employee));
        redirectAttributes.addFlashAttribute("employee", employeeService.save(employee));
        return "redirect:/details";
    }

    @GetMapping("/details")
    public String employeeDetail(){
        return "employeeDetail";
    }

}
