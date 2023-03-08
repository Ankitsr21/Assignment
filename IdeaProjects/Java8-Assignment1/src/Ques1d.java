interface myInterface3{
    String upperCase(String a);
}
public class Ques1d {
    public static void main(String[]args){
        myInterface3 demo = (a)->a.toUpperCase();
        System.out.println(demo.upperCase("tothenew"));
    }
}
