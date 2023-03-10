interface myInterface{
    private static String show(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static String upperReverse(String s){
      String upper = s.toUpperCase();
      return show(upper);
    }
    static String lowerReverse(String s){
        String lower = s.toLowerCase();
        return show(lower);
    }
}
public class Ques1 {
    public static void main(String[]args){
        System.out.println(myInterface.upperReverse("Ankit"));
        System.out.println(myInterface.lowerReverse("Rawat"));
    }
}
