package com.RestApiWebServices.RestApi;

import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class EmployeeDAO {
    private static List<Employee> employees = new ArrayList<>();

    private static int userCount=0;
    static {
        employees.add(new Employee(++userCount,"Ankit",23));
        employees.add(new Employee(++userCount,"Harshit",24));
        employees.add(new Employee(++userCount,"Kartik",25));
    }

    //getting all employees
    public List<Employee> findAll(){
        return employees;
    }

    //getting one employee by path variable
    public Employee findOne(int empId){
        Predicate<? super Employee> predicate = employees->employees.getEmpId()==(empId);
        return employees.stream().filter(predicate).findFirst().orElse(null);
    }
    public void delete(int empId){
        Predicate<? super Employee> predicate = employees->employees.getEmpId()==(empId);
        employees.removeIf(predicate);
    }

    public Employee save(Employee employee){
        employee.setEmpId(++userCount);
        employees.add(employee);
        return employee;
    }

    public Employee update(Employee e) {
        int index=0;
        for(Employee emp:employees){
            if(emp.getEmpId()==e.getEmpId()){
                index=employees.indexOf(emp);
                break;
            }
        }
        employees.set(index,e);
        return e;
    }
}
