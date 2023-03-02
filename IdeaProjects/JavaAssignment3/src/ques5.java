public class ques5 {
    private static ques5 instance = new ques5();
    private ques5(){}
    public static ques5 getInstance(){
        return instance;
    }
    public void lightOn(){
        System.out.println("Light is ON");
    }
    public void lightOff(){
        System.out.println("Light is OFF");
    }
}
