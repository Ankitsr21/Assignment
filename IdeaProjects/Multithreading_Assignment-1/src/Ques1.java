public class Ques1 extends Thread {
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
class abc{
    public static void main(String[]args){
        Ques1 obj = new Ques1();
        Ques1 obj1 = new Ques1();
        System.out.println("Using Thread Class");
        System.out.println("Thread2 start ");
        obj1.start();
        try {
            obj1.join();
        }
        catch (Exception e){

        }
        System.out.println("Thread1 start");
        obj.start();
    }
}
