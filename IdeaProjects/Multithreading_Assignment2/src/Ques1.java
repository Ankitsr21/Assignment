
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableDemo implements Callable<String>{
    public String call() throws Exception{
        return "Callable Example";
    }
}

public class Ques1{
    static ExecutorService executor = Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws Exception{
        CallableDemo task = new CallableDemo();
        task.call();
        Future<String> message = executor.submit(task);
        System.out.println(message.get().toString());
        executor.shutdown();
    }
}
