interface myInterface2{
    String concat(String a, String b);
}
public class Ques1c {
    public static void main(String[]args){
        myInterface2 demo = (a,b)->a+b;
        System.out.println(demo.concat("Ankit","Rawat"));
    }
}
