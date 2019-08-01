package com.students.service;

import com.students.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {
    Integer id = 1;
    HashMap<Integer, Student> students= new HashMap<>();

    public void save(Student student){
        student.setId(id);
        students.put(id++,student);
    }
    public List<Student> getAll(){
        return new ArrayList<>(students.values());
    }
}

