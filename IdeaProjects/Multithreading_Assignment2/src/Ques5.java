import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Ques5 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        ScheduledFuture<String> result1 = executor.schedule(new WorkerTask(
                "WorkerTask-1"), 10, TimeUnit.SECONDS);

        ScheduledFuture<String> result2 = executor.schedule(new WorkerTask(
                "WorkerTask-2"), 20, TimeUnit.SECONDS);

        ScheduledFuture<String> result3 = executor.schedule(new WorkerTask(
                "WorkerTask-3"), 30, TimeUnit.SECONDS);

        Thread.sleep(15_000);
        System.out.println("***********Shutting down the executor service*********");
        executor.shutdown();

        System.out.println("***********Tasks are partially completed*********");

        System.out.println("Task-1 is done : " + result1.isDone());
        System.out.println("Task-2 is done : " + result2.isDone());
        System.out.println("Task-3 is done : " + result3.isDone());

        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("***********All tasks are completed now*********");

        System.out.println("Task-1 is done : " + result1.isDone());
        System.out.println("Task-2 is done : " + result2.isDone());
        System.out.println("Task-3 is done : " + result3.isDone());
    }
}

class WorkerTask implements Callable<String> {
    private final String name;

    public WorkerTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {

        return "WorkerTask [" + name + "] is SUCCESS !!";
    }
}
