interface myInterface{
    int increment();
}
public class Ques1b {
    public static void main(String[]args){
        int i=10;
        System.out.println("Before Incremented value = "+i);
        myInterface demo = ()->{
          return i+1;
        };
        System.out.println("After Incremented = "+demo.increment());
    }
}
