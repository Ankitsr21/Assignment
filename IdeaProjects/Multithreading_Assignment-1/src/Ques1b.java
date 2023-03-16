public class Ques1b implements Runnable {
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1050);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
class SingleThread{
    public static void main(String[]args){
        Ques1b obj = new Ques1b();
        Ques1b obj2 = new Ques1b();
        Thread t = new Thread(obj);
        Thread t2 = new Thread(obj2);
        System.out.println("Using Runnable Interface");
        System.out.println("Thread1 Start");
        t.start();
        try {
            t.join();
        }
        catch (Exception e){

        }
        System.out.println("Thread 2 Start");
        t2.start();

    }
}
