package com.hibernate.Hibernate.repos;

import com.hibernate.Hibernate.entity.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employees,Integer> , PagingAndSortingRepository<Employees,Integer> {
    List<Employees> findByName(String name);
    List<Employees> findByNameAndAge(String name, int age);

    List<Employees> findByAgeGreaterThan(int age);
    List<Employees> findByAgeBetween(int age1, int age2);

    List<Employees> findByNameLike(String name);

}
