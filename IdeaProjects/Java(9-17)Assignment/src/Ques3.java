import java.util.stream.IntStream;

public class Ques3 {
    public static void main(String[]main){
        IntStream.range(20,23).forEach(System.out::println);
        System.out.println("------Closed Range------");
        IntStream.rangeClosed(20,23).forEach(System.out::println);
    }
}
