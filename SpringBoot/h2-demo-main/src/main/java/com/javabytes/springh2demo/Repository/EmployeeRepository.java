package com.javabytes.springh2demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabytes.springh2demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
