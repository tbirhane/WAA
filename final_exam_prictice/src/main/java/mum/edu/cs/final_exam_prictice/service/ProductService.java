package mum.edu.cs.final_exam_prictice.service;

import mum.edu.cs.final_exam_prictice.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
}
