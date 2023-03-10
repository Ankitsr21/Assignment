import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ques9 {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        List<Integer> list2 = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable list: " + list2);
        list.add(50);
        System.out.println("List after adding (50): "+list);

    }
}
