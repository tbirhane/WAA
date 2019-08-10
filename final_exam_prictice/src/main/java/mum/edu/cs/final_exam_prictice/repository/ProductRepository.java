package mum.edu.cs.final_exam_prictice.repository;

import mum.edu.cs.final_exam_prictice.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
