package com.greatlearning.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.employee.entity.Employee;
import com.greatlearning.employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Employee emp1 = new Employee("Sona", "Dhruw","sonadhruw@gmail.com");
		 * employeeRepository.save(emp1);
		 * 
		 * 
		 * Employee emp2 = new Employee("Rohit", "Kumar","rohitkumar@gmail.com");
		 * employeeRepository.save(emp2);
		 * 
		 * 
		 * Employee emp3 = new Employee("Keshav", "Thakur","keshavthakur@gmail.com");
		 * employeeRepository.save(emp3);
		 */
	}

}
