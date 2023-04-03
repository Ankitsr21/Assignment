package com.RestApiWebServices.RestApi;

import jakarta.validation.constraints.Size;

public class Employee {
    private int empId;
    @Size(min = 2)
    private String empName;

    private int empAge;

    public Employee(int empId, String empName, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge='" + empAge + '\'' ;
    }
}
