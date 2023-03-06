interface myInterface4{
    int methodRef(int a,int b);
}
public class Ques2 {
    static int multi(int a, int b){
        return a*b;
    }
    int sum(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    public static void main(String[]args){
        myInterface4 multi = Ques2::multi;
        System.out.println("Multiple = "+multi.methodRef(2,3));
        myInterface4 sum = new Ques2()::sum;
        System.out.println("Sum = "+sum.methodRef(2,3));
        myInterface4 sub = new Ques2()::sub;
        System.out.println("Substraction = "+sub.methodRef(7,2));
    }
}
