package mum.edu.cs.final_exam_prictice.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    private Long id;
    private String title;
    private String description;
    private double price;
}
