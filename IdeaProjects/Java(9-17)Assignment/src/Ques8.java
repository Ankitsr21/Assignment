public class Ques8 {
    public static void main(String[] args){
        try (Example e1 = new Example(); Example2 e2 = new Example2()) {
            e1.show();
            e2.show1();
        }
    }
}

