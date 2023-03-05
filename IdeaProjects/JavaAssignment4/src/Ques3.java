import java.util.Stack;

public class Ques3{

    Stack<Integer> ss=new Stack<>();
    Stack<Integer> s=new Stack<>();


    void push(int a){
        s.push(a);
        if(ss.size()==0||ss.peek()>a){
            ss.push(a);
        }
        return;
    }
    int pop(){
        if(s.size()==0)
            return -1;
        int ans=s.peek();
        s.pop();
        if(ss.peek()==ans){
            ss.pop();
        }
        return ans;
    }
    int getMin(){
        if(ss.size()==0)
            return -1;
        return ss.peek();
    }
    public static void main(String[]args){

        Ques3 stk = new Ques3();
        stk.push(1);
        stk.push(23);
        stk.push(0);
        stk.push(2);
        System.out.println(stk.getMin());
    }
}
