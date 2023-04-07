package com.hibernate.Hibernate;

import com.hibernate.Hibernate.entity.Employees;
import com.hibernate.Hibernate.repos.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HibernateApplicationTests {
	@Autowired
	EmployeeRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employees emp = new Employees();
		emp.setId(2);
		emp.setName("Ankur");
		emp.setAge(25);
		emp.setLocation("Noida");

		repo.save(emp);
	}

	@Test
	public void testRead(){
		Employees emp = repo.findById(1).get();
		assertNotNull(emp);
		assertEquals("Ankit",emp.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>"+emp.getLocation());
	}

	@Test
	public void testUpdate(){
		Employees emp = repo.findById(1).get();
		emp.setLocation("Ghaziabad");
		repo.save(emp);
	}

	@Test
	public void testDelete(){
		repo.deleteById(2);
	}

	@Test
	public void testCount(){
		System.out.println(repo.count());
	}

	@Test
	public void testEmpName(){
		List<Employees> emp = repo.findByName("Ankit");
		emp.forEach(p-> System.out.println(p.getLocation()));
	}

	@Test
	public void testEmpNameAndAge(){
		List<Employees> emp = repo.findByNameAndAge("Ankit",23);
		emp.forEach(p-> System.out.println(p.getLocation()));
	}

	@Test
	public void testEmpGreaterThan(){
		List<Employees> emp = repo.findByAgeGreaterThan(23);
		emp.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void testAge(){
		List<Employees> emp = repo.findByAgeBetween(23,24);
		emp.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void testNameLike(){
		List<Employees> emp = repo.findByNameLike("A%");
		emp.forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void testPagingAndSorting(){
		Pageable sc= PageRequest.of(0,1,Sort.Direction.DESC,"age");
		Page<Employees> res=repo.findAll(sc);
		res.forEach(p-> System.out.println(p.getName()));
	}

}
