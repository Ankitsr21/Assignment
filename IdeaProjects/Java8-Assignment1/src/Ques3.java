interface interface1{
    default void show(){
        System.out.println("Parent 1");
    }
}
interface interface2{
    default void show(){
        System.out.println("Parent 2");
    }
}
public class Ques3 implements interface1, interface2{
    public void show(){
        System.out.println("Child");
    }
    public static void main(String[]args){
        Ques3 obj = new Ques3();
        obj.show();
    }
}
