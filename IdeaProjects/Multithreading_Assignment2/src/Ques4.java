import java.util.Random;
import java.util.concurrent.*;

class FutureDemo implements Callable<Integer>{
    public Integer call() throws Exception{
        Random r = new Random();
        int i = r.nextInt(100);
        System.out.println("Random Integer ");
        return i;
    }
}
public class Ques4 {
    static ExecutorService executor = Executors.newFixedThreadPool(2);
    public static void main(String[]args) throws ExecutionException, InterruptedException{
        FutureDemo obj = new FutureDemo();
        Future<Integer> res = executor.submit(obj);
        System.out.println(res.get());
        executor.shutdown();
    }
}
