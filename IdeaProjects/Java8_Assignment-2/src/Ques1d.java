interface Function{
    int show(String m);
}
public class Ques1d {
    public static void main(String[]args){
        Function fun = ((m) -> {
            if (m != " ")
                return 1;
            else
                return 0;
        });
        System.out.println(fun.show(""));
    }
}
