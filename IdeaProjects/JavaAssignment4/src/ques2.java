import java.util.Comparator;
abstract class ques2 implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        int fnameCompare = e1.getFirstname().compareTo(e2.getFirstname());
        int lnameCompare = e1.getLastname().compareTo(e2.getLastname());
        return (fnameCompare == 0) ? fnameCompare:lnameCompare;
    }
}
