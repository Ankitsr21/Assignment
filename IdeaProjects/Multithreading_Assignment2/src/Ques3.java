import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ques3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int finalI = i;
            Callable<Integer> task = () -> {
                System.out.println("Task " + finalI + " executing...");
                Thread.sleep(1000);
                System.out.println("Task " + finalI + " completed.");
                return finalI;
            };
            tasks.add(task);
        }

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        List<Future<Integer>> singleThreadExecutorFutures = new ArrayList<>();
        List<Future<Integer>> cachedThreadPoolFutures = new ArrayList<>();
        List<Future<Integer>> fixedThreadPoolFutures = new ArrayList<>();
        for (Callable<Integer> task : tasks) {
            Future<Integer> singleThreadExecutorFuture = singleThreadExecutor.submit(task);
            Future<Integer> cachedThreadPoolFuture = cachedThreadPool.submit(task);
            Future<Integer> fixedThreadPoolFuture = fixedThreadPool.submit(task);
            singleThreadExecutorFutures.add(singleThreadExecutorFuture);
            cachedThreadPoolFutures.add(cachedThreadPoolFuture);
            fixedThreadPoolFutures.add(fixedThreadPoolFuture);
        }

        for (Future<Integer> future : singleThreadExecutorFutures) {
            int result = future.get();
            System.out.println("SingleThreadExecutor result: " + result);
        }
        for (Future<Integer> future : cachedThreadPoolFutures) {
            int result = future.get();
            System.out.println("CachedThreadPool result: " + result);
        }
        for (Future<Integer> future : fixedThreadPoolFutures) {
            int result = future.get();
            System.out.println("FixedThreadPool result: " + result);
        }

        singleThreadExecutor.shutdown();
        cachedThreadPool.shutdown();
        fixedThreadPool.shutdown();
    }
}
