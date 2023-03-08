import java.util.*;
import java.io.*;
class Ques5{
    public static class Employee {
        String fullname;
        Long salary;
        String city;

        Employee(String fullname, Long salary, String city) {
            this.fullname = fullname;
            this.salary = salary;
            this.city = city;
        }
    }
    public static List<Employee> create_emp(){
        return Arrays.asList(
                new Employee("Ankit Rawat",15100L,"Ghaziabad"),
                new Employee("Vaibhav",4000L,"Delhi"),
                new Employee("Prabhat",10000L,"Sahibabad"),
                new Employee("Harshit",3500L,"Delhi"));
    }

    public static void main(String[] args) {
        List<Employee>emp1= create_emp();
        emp1.stream()
                .filter(e->e.salary<5000)
                .filter(e->e.city=="Delhi")
                .forEach(e-> System.out.println(e.fullname.split(" ")[0]));
    }

}

