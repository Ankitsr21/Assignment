import java.io.*;
import java.util.Scanner;
public class TotalAmount {
    public static void main(String[] args) {
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bank = ");
        String planType = sc.nextLine();
        System.out.println("enter the amount = ");
        amount = sc.nextInt();
        SelectBank amt = new SelectBank();
        Bank ep = Bank.getInterestPlan(planType);
        System.out.print("Bill amount for " + planType + " of  " + amount+" units is: ");
        ep.getInterestRate();
        ep.processBill(amount);
    }
}

