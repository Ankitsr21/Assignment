package com.hibernate2.Hibernate2.ComponentMapping;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
    @Id
    private int empid;
    private String empfirstname;
    private String emplastname;
    private int empage;
    @Embedded
    private Salary salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpfirstname() {
        return empfirstname;
    }

    public void setEmpfirstname(String empfirstname) {
        this.empfirstname = empfirstname;
    }

    public String getEmplastname() {
        return emplastname;
    }

    public void setEmplastname(String emplastname) {
        this.emplastname = emplastname;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
