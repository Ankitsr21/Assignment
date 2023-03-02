abstract public class Bank {
    protected double InterestRate;

//    public static Bank getInterestPlan(String planType) {
//    }

    abstract void getInterestRate();

    public void processBill(int amount){
        System.out.println(amount*InterestRate);
    }
}
