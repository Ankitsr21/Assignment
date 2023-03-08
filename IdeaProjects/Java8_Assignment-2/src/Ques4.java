import java.util.Arrays;
import java.util.List;

public class Ques4 {
    public static void main(String[]args){
        List<Integer> lists = Arrays.asList(1, 6, 3, 4, 15, 6, 18, 9);
        int res=lists.stream()
                .filter(e->e>3)
                .filter(e->e%2==0)
                .map(e->e*2)
                .findFirst()
                .get();
        System.out.println(res);
    }
}
