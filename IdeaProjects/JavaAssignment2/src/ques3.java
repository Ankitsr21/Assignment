public class ques3 {
    public static void main(String[]args){
        try {
            Class.forName("Ankit");
        }
        catch (ClassNotFoundException abc){
            System.out.println("ClassNotFound");
            abc.printStackTrace();
        }
    }
}
