interface Demo{
    boolean compare(int a, int b);
}
public class Ques1a {
    public static void main(String[] args) {
        Demo demo = (a,b)->{
            if (a<b){
                return true;
            }
            return false;
        };
        System.out.println(demo.compare(2,3));
    }
}