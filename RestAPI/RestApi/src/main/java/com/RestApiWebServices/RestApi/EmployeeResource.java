package com.RestApiWebServices.RestApi;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
public class EmployeeResource {
    private EmployeeDAO service;
    public EmployeeResource(EmployeeDAO service){
        this.service=service;
    }
    @GetMapping("/employees")
    public List<Employee> retrieveAll(){
        return service.findAll();
    }

    @GetMapping("/employees/{empId}")
    public Employee retrieveEmp(@PathVariable int empId) {
        Employee employee = service.findOne(empId);
        if(employee==null){
            throw new UserNotFoundException("id: "+empId);
        }
        return employee;
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmp(@PathVariable int empId) {
        service.delete(empId);
    }

    //posting
    @PostMapping("employees")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee){
        service.save(employee);
        return ResponseEntity.created(null).build();
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee e) {
        return service.update(e);
    }
}
