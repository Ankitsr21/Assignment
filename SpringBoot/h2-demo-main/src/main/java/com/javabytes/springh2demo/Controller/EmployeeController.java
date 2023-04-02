package com.javabytes.springh2demo.Controller;

import com.javabytes.springh2demo.Model.Employee;
import com.javabytes.springh2demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployeeList(){
        try{
            List<Employee> employeeList = new ArrayList<Employee>();
            repository.findAll().forEach(employeeList::add);

            if(employeeList.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable Long id){
        Optional<Employee> employee = repository.findById(id);
        if(employee.isPresent()){
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
       Employee employeeObj = repository.save(employee);
       return new ResponseEntity<>(employeeObj, HttpStatus.OK);
    }
    @PostMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee newEmployee){
     Optional<Employee> oldEmployee = repository.findById(id);

     if(oldEmployee.isPresent()){
         Employee updatedEmployee = oldEmployee.get();
         updatedEmployee.setEmpName(newEmployee.getEmpName());
         updatedEmployee.setEmpEmail(newEmployee.getEmpEmail());

         return new ResponseEntity<>(repository.save(updatedEmployee), HttpStatus.OK);
     }
     return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
