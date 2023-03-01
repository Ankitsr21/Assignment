public class ques3b{
    public static void main (String[] args){
        try{
            second other = new second();
            other.ttn();
        }
        catch(NoClassDefFoundError e){
            System.out.println("Caught NoClassDefFoundError: "+e.getMessage());
        }
    }
}