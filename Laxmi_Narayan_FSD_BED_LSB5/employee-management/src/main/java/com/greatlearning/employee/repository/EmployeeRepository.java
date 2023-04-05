package com.greatlearning.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
