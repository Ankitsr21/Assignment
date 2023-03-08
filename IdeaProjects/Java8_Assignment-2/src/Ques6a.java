import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ques6a {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Date(yyyy-MM-dd): ");
        String firstDate = sc.nextLine();
        LocalDate d1 =LocalDate.parse(firstDate);

        System.out.println("Enter the Second Date(yyyy-MM-dd): ");
        String secondDate = sc.nextLine();
        LocalDate d2 =LocalDate.parse(secondDate);

        if(d1.isBefore(d2)){
            System.out.println("First Date occurs before Second Date");
        }
        else if (d1.isAfter(d2)){
            System.out.println("First Date occurs after Second Date");
        }else {
            System.out.println("Both Dates are same ");
        }

    }
}
