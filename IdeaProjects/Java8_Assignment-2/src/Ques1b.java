import org.w3c.dom.ls.LSOutput;

interface supplier{
    int show();
}
public class Ques1b {
    public static void main(String[] args) {
        supplier obj = (() -> 1);
        System.out.println(obj.show());

    }
}