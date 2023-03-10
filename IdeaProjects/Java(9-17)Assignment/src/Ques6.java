import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ques6 {
    public static void main(String[]args){
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        mylist.stream()
                .filter(i->i>8)
                .findFirst().stream()
                .mapMulti((num,cons)-> IntStream.rangeClosed(1,10)
                .forEach(i->cons.accept(i*num)))
                .forEach(System.out::println);
    }
}
