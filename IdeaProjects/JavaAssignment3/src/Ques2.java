public class Ques2 {
    String FirstName;
    String LastName;
    String age;
    String PhoneNo;

    public Ques2( ) {
        this.FirstName = " ";
        this.LastName = " ";
        this.age = " ";
        this. PhoneNo = " ";
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age='" + age + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }
}