import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
    public static  void main(String[]args){
        List<Double> num = Arrays.asList(11.1,22.0,3.8,44.0,5.6);
        float sum  = 0;
        Iterator<Double> iterator = num.iterator();
        while (iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
