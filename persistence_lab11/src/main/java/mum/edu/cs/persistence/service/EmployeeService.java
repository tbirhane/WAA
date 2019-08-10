package mum.edu.cs.persistence.service;

import mum.edu.cs.persistence.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee save(Employee employee);
    Employee delete(Employee employee);
    Employee update(Employee employee);
    Employee getEmployeeById(Long id);
    Employee getByNumber(int number);
}
