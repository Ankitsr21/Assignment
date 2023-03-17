import java.util.concurrent.locks.ReentrantLock;

public class MyThread1 implements Runnable{
    private ReentrantLock lock1;
    private ReentrantLock lock2;
    public MyThread1(ReentrantLock lock1, ReentrantLock lock2){
        this.lock1=lock1;
        this.lock2=lock2;
    }
    public void run(){
        lock1.lock();
        try {
            System.out.println(Thread.currentThread().getName()+ " lock resource 1");
        }
        finally {
            lock1.unlock();
        }
        lock2.lock();
        try {
            System.out.println(Thread.currentThread().getName()+ " lock resource 2");
        }
        finally {
            lock2.unlock();
        }
    }
}
