package mum.edu.cs.final_exam_prictice.controller;

import mum.edu.cs.final_exam_prictice.model.Product;
import mum.edu.cs.final_exam_prictice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
@Autowired
    ProductService productService;
    @GetMapping("/")
    public String displayProductForm(@ModelAttribute Product product){
        return "productForm";
    }
    @PostMapping("/addProduct")
    public String saveProduct(Product product, Model model){
       model.addAttribute("detail", productService.save(product));
       return "redirect:/productlist";
    }
    @GetMapping("/productlist")
    public String productlist(@ModelAttribute Product product){
        return "productlist";
    }

}
