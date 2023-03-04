import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private String firstname;
    private String lastname;
    private double salary;
    private double age;

    public Employee(String firstname, String lastname, double salary, double age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getAge(){
        return age;
    }
    public void setAge(double age){
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", age=" + age
                ;
    }
    public static void main(String[]args){
        List<Employee> emp = new ArrayList<>();
        Employee emp1 = new Employee("Ankit", "Rawat", 15000, 23);
        Employee emp2 = new Employee("Ankit", "Negi", 16000, 23);
        Employee emp3 = new Employee("Harshit", "Sharma", 19000, 23);
        Employee emp4 = new Employee("Prabhat", "Baluni", 10000, 23);
        Employee emp5 = new Employee("Kartik", "Chamoli", 52000, 23);
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        emp.add(emp5);
        Iterator<Employee> iterable = emp.iterator();
        Collections.sort(emp, new ques2() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return super.compare(e1, e2);
            }
        });
        for (Employee e:emp){
            System.out.println(e);
        }


    }
}