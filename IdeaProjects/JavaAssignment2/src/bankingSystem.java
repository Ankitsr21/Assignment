//enum accountType {
//    CURRENT,
//    SAVINGS
//}
abstract class bankingSystem {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personLoanInterestRate;
    private double homeLoanInterestRate;
    public bankingSystem(String name,String chairmanName,String headOfficeAddress, int branchCount, double fdInterestRate, double personLoanInterestRate, double homeLoanInterestRate){
        this.name = name;
        this.chairmanName = chairmanName;
        this.headOfficeAddress= headOfficeAddress;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
        this.personLoanInterestRate = personLoanInterestRate;
    }
    public double getfdInterestRate(){
        return fdInterestRate;
    }
    public void setFdInterestRate(double fdInterestRate){
        this.fdInterestRate= fdInterestRate;
    }
    public double getHomeLoanInterestRate(){
        return homeLoanInterestRate;
    }
    public void setHomeLoanInterestRate(double homeLoanInterestRate){
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public double getPersonLoanInterestRate(){
        return personLoanInterestRate;
    }
    public void setPersonLoanInterestRate(double personLoanInterestRate){
        this.personLoanInterestRate=personLoanInterestRate;
    }
    public String getDetails(){
        return "Bank: " +name+"\nHead Office Address: "+headOfficeAddress+"\nChairman Name: "+chairmanName+"\nFD Interest Rate: "+fdInterestRate+"\nHome Loan Interest Rate: "+homeLoanInterestRate+"\nPersonal Loan Interest Rate: "+personLoanInterestRate;
    }
    public void printDetails(){
        System.out.println(getDetails());
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", headOfficeAddress='" + headOfficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personLoanInterestRate=" + personLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate
                ;
    }
    public static void main(String[]args){
        SBI sbi = new SBI("SBI","Delhi","Gaurav",1,7,7,8);
        ICICI icici = new ICICI("ICICI","Delhi","Shyam",8,6,7,8);
        System.out.println();
    }
}


