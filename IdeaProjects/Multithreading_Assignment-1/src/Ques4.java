public class Ques4 {
    public static void main(String[]args){
        Object lock1 = new Object();
        Object lock2 = new Object();
        MyThread1 t1 = new MyThread1(lock1,lock2);
        MyThread2 t2 = new MyThread2(lock1,lock2);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
