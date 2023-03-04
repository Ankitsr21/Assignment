import java.util.Stack;

class Ques3 extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();
    void push(int x) {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        }
        else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    public Integer pop() {
        int x = super.pop();
        min.pop();
        return x;
    }

    int getMin() {
        int x = min.pop();
        min.push(x);
        return x;
    }

    public static void main(String[] args) {
        Ques3 s = new Ques3();
        s.push(9);
        s.push(22);
        s.push(12);
        System.out.println(s.getMin());
        s.push(5);
        s.push(0);
        System.out.println(s.getMin());
    }
}
