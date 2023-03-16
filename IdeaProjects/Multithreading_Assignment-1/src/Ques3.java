public class Ques3 {
    private volatile int count = 0;
    public int getCount(){
        return count;
    }
    public void incrementCount(){
        System.out.println(count++);
    }
}
class singleTh{
    public static void main(String[]args){
        Ques3 obj = new Ques3();
        Thread th = new Thread(()->{
            for (int i=0;i<5;i++){
                obj.incrementCount();
            }
        });
        Thread th2 = new Thread(()->{
            for (int i=0;i<5;i++){
                obj.incrementCount();
            }
        });
        System.out.println("First Thread");
        th.start();
        try {
            th.join();
        }catch (Exception e){

        }
        System.out.println("Second Thread");
        th2.start();
    }
}