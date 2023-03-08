interface consumer<A>{
    void accept(A m);
}
public class Ques1a {
    public static void main(String[]args){
        consumer <String> sc = (m) -> {System.out.println("No value return");};
        sc.accept("Ankit");
    }
}
