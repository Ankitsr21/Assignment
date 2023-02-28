import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question2 {
        public static void main(String[]args){
            List<String> user = new ArrayList<>();
            System.out.println("Enter the value or type XDone to end ");
            Scanner sc = new Scanner(System.in);
            while(true){
                String line = sc.nextLine();
                if("XDone".equalsIgnoreCase(line)){
                    break;
                }
                user.add(line);
            }
            System.out.print(user);
        }
}
