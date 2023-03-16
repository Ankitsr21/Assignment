public class MyThread2 implements Runnable{
    private Object lock1;
    private Object lock2;
    public MyThread2(Object lock1, Object lock2){
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
