package mum.edu.cs.persistence.repository;

import mum.edu.cs.persistence.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value = "select emp from Employee emp where emp.number=:number")
    Employee locateOneEmployeeByHisNumber(int number);

}
