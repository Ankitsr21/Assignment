import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 implements Runnable{
    private ReentrantLock lock1;
    private ReentrantLock lock2;
    public MyThread2(ReentrantLock lock1, ReentrantLock lock2){
        this.lock1=lock1;
        this.lock2=lock2;
    }
    public void run(){
        synchronized (lock2){
            System.out.println(Thread.currentThread().getName()+" lock resource 2");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            synchronized (lock1){
                System.out.println(Thread.currentThread().getName()+" lock resource 1");
            }
        }
    }
}
