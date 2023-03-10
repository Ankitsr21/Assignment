import java.util.Arrays;
import java.util.List;

public class Ques2 {
    public static void main(String[]args){
        List<Integer> myList = Arrays.asList(2,4,6,7,8,10,12,24);
        System.out.println("-------takeWhile-------");
        myList.stream()
                .takeWhile(e->e%2==0)
                .forEach(System.out::println);
        System.out.println("-------dropWhile-------");
        myList.stream()
                .dropWhile(n->n>5)
                .forEach(System.out::println);
    }
}
