interface  predicate{
    boolean show(int a, int b);
}
public class ques1c {
    public static void main(String[]args){
        predicate pre = (a,b)->{
            if(a>b){
                return true;
            }
            return false;
        };
        System.out.println(pre.show(9,8));
    }
}
