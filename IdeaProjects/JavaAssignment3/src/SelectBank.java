import java.util.Locale;

public class SelectBank
{
    public Bank getInterestPlan(String planType) {
        if (planType== null || planType.isEmpty())
            return null;
        switch (planType.toLowerCase()) {
            case "sbi":
                return new SBI();
            case "icici":
                return new ICICI();
            default:
                throw new IllegalArgumentException("Unknown channel "+planType);
        }
    }

}