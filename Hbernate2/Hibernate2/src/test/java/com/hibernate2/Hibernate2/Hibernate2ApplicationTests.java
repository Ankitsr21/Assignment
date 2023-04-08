package com.hibernate2.Hibernate2;

import com.hibernate2.Hibernate2.ComponentMapping.EmployeeSalaryRepositary;
import com.hibernate2.Hibernate2.ComponentMapping.Employees;
import com.hibernate2.Hibernate2.ComponentMapping.Salary;
import com.hibernate2.Hibernate2.JoinedMapping.BankCheck;
import com.hibernate2.Hibernate2.JoinedMapping.Card;
import com.hibernate2.Hibernate2.JoinedMapping.Payment_JoinedRepository;
import com.hibernate2.Hibernate2.SingleTableMapping.CreditCard;
import com.hibernate2.Hibernate2.SingleTableMapping.DebitCard;
import com.hibernate2.Hibernate2.SingleTableMapping.PaymentRepository;
import com.hibernate2.Hibernate2.TablePerClassMapping.CreditCard1;
import com.hibernate2.Hibernate2.TablePerClassMapping.DebitCard1;
import com.hibernate2.Hibernate2.TablePerClassMapping.PaymentRepository1;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class Hibernate2ApplicationTests {
	@Autowired
	EmployeeRepo repo;

	@Autowired
	PaymentRepository1 repo2;

	@Autowired
	PaymentRepository repo1;

	@Autowired
	Payment_JoinedRepository repo3;

	@Autowired
	EmployeeSalaryRepositary repo4;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Navpreet");
		emp.setLastName("Singh");
		emp.setSalary(30000);
		emp.setAge(50);
		repo.save(emp);
	}

	@Test
	public void testRead() {
		System.out.println(repo.findAllEmployees());

	}

	@Test
	public void testFindPartialData() {
		List<Object[]> sc = repo.findfname();
		for (Object[] objects : sc) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}


	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdateSalary() {
		System.out.println(repo.updateSalary((repo.avg()), 30000));
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testDelMinSalary(){
		System.out.println(repo.deleteMinSalary(repo.min()));
	}

	@Test
	public void testFindAllDetail() {
		List<Object[]> sc = repo.findAllDetail();
		for (Object[] objects : sc) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testAgeGreaterThan(){
		System.out.println(repo.deleteAgeGreaterThan(repo.ageGreaterThan()));
	}


	@Test
	public void testCreditCard(){
		CreditCard credit = new CreditCard();
		credit.setId(1);
		credit.setAmount(15100);
		credit.setCreditCard("123456789");
		repo1.save(credit);
	}

	@Test
	public void testDebitCard(){
		DebitCard debit = new DebitCard();
		debit.setAmount(15100);
		debit.setDebitCard("987654321");
		repo1.save(debit);
	}
	@Test
	public void testCreditCard_Table(){
		CreditCard1 cc=new CreditCard1();
		cc.setId(2);
		cc.setAmount(50000);
		cc.setCredit_card("234567810");
		repo2.save(cc);
	}
	@Test
	public void testDebitCard_Table(){
		DebitCard1 dc = new DebitCard1();
		dc.setId(1);
		dc.setAmount(19000);
		dc.setDebit_card("55667788");
		repo2.save(dc);
	}


	@Test
	public void testCardJoined(){
		Card cc = new Card();
		cc.setId(1);
		cc.setAmount(30000);
		cc.setCardnumber("123456789");
		repo3.save(cc);
	}

	@Test
	public void testBankCheckJoined(){
		BankCheck cc = new BankCheck();
		cc.setId(2);
		cc.setAmount(30000);
		cc.setChecknumber("99887766");
		repo3.save(cc);
	}

	@Test
	public void testComponentMapping(){
		Employees emp = new Employees();
		emp.setEmpid(1);
		emp.setEmpfirstname("Ankit");
		emp.setEmplastname("Rawat");
		emp.setEmpage(23);
		Salary sal = new Salary();
		sal.setBasicSalary(700f);
		sal.setBonusSalary(650f);
		sal.setTaxAmount(30f);
		sal.setSpecialAllowanceSalary(550f);
		emp.setSalary(sal);
		repo4.save(emp);
	}
}
