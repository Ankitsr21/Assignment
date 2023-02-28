public class switchCircle {
    public static void main(String[]args){
        int choice = 4;
        switch (choice){
            case 1:{
                int r=4;
                double pi = 3.14;
                double area= pi*r*r;
                System.out.println("Area of circle: "+area);
                break;
            }
            case 2:{
                int r=4;
                double pi = 3.14;
                double circum= 2*pi*r;
                System.out.println("Circumference of circle: "+ circum);
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }
    }
}
