import java.util.HashMap;
import java.util.Map;

public class Ques4 {
    private String name;
    private int age;
    private String designation;
    private double salary;
    public Ques4 (String name,int age,String designation,double salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary
                ;
    }

    public static void main(String[]args){
        Ques4 emp1 = new Ques4("Ankit",23,"Trainee",15000);
        Ques4 emp2 = new Ques4("Kartik",23,"Software Developer", 52000);
        Ques4 emp3 = new Ques4("Harsh",23, "Associate Developer",19000);
        Ques4 emp4 = new Ques4("Sid",21,"Game Developer", 40000);
        Ques4 emp5 = new Ques4("Pradeep",23,"Developer",12000);

        Map<Ques4,Double> sal = new HashMap<>();
        sal.put(emp1,emp1.getSalary());
        sal.put(emp2,emp2.getSalary());
        sal.put(emp3,emp3.getSalary());
        sal.put(emp4,emp4.getSalary());
        sal.put(emp5,emp5.getSalary());

        for (Map.Entry<Ques4,Double> entry : sal.entrySet()){
            System.out.println("Employee: "+entry.getKey().getName()+"\n Salary: "+entry.getKey().getSalary());
        }
    }
}
