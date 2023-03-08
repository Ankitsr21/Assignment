interface myInterface{
    public static void show(){
        System.out.println("Static Function");
    }
    default void message(){
        System.out.println("Default Function");
    }
}
public class Ques2 implements myInterface{
    public static void main(String[]args){
        myInterface.show();
        Ques2 obj = new Ques2();
        obj.message();
    }
}
