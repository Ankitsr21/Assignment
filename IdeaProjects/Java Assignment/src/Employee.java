public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private String designation;
    public Employee(){
        firstname="";
        lastname="";
        age=0;
        designation="";
    };
    public Employee(String fname,String lname,int aage,String design){
        this.firstname = fname;
        this.lastname = lname;
        this.age = aage;
        this.designation = design;
    }
    public String getFname(){
        return firstname;
    }
    public String getLname(){
        return firstname;
    }
    public int getAge(){
        return age;
    }
    public String getDesignation(){
        return designation;
    }
    public void setFirstname(String fname){
        firstname = fname;
    }
    public void setLastname(String lname){
        lastname = lname;
    }
    public void setAge(int aage){
        age = aage;
    }
    public void setDesignation(String design){
        designation = design;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
    public static void main(String[]args){
        Employee obj = new Employee();
        obj.setFirstname("Ankit");
        obj.setLastname("Rawat");
        obj.setDesignation("Trainee");
        obj.setAge(23);

        System.out.println(obj.toString());
    }
}
