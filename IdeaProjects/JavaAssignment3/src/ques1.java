enum House{
        oneBHK(23),
        twoBHK (34),
        threeBHK(44);
        private int price;
        House(int p){
            price = p;
        }
        int getPrice(){
            return price;
        }

        }

public class ques1 {
    public static void main(String[] args){
        System.out.println("All House Prices");
        for (House h: House.values())
            System.out.println(h+" costs "+ h.getPrice()+" lakhs.");
    }
}