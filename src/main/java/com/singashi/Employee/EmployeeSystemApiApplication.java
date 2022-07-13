package com.singashi.Employee;

import com.singashi.Employee.entity.EmployeeEntity;
import com.singashi.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeSystemApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSystemApiApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new EmployeeEntity("Akash", "Singh", "akash@123.com"));
	}
}
