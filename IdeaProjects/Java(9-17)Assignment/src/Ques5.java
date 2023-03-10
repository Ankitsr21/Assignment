import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ques5 {
    public static void main(String[]args){
        List<Integer> sc=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        sc.stream()
                .filter(e -> e>7).findFirst()
                .ifPresentOrElse(System.out::println,()->System.out.println("Number is not present"));
        Stream.of(5,6,7,8,9,10,11,12).filter(e->e>12).findFirst().orElseThrow();
    }
}
