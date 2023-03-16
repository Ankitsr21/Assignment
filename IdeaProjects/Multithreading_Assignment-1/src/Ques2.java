public class Ques2 {
    synchronized void display(){
        Thread g = Thread.currentThread();
        for (int i=0;i<2;i++){
            try {
                System.out.println(g.getName()+" "+i);
            }
            catch (Exception e){

            }
        }

    }
    void show(){
        Thread h = Thread.currentThread();
        synchronized (this){
            for (int i=0;i<3;i++){
                try {
                    System.out.println(h.getName()+" "+i);
                }
                catch (Exception e){
                }
            }
        }
    }
}
class thread1 extends Thread{
    Ques2 obj;
    thread1(Ques2 obj){
        this.obj=obj;
    }
    public void run(){
        obj.display();
        obj.show();
    }
}
class TSych {
    public static void main(String[]args){
        Ques2 obj2= new Ques2();
        thread1 t1= new thread1(obj2);
        thread1 t2= new thread1(obj2);
        thread1 t3= new thread1(obj2);
        t1.start();
        t2.start();
        t3.start();
    }
}