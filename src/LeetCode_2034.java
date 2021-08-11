import java.util.LinkedList;
import java.util.Stack;

class MinStack {

    Stack<Integer> A,B;

    /** initialize your data structure here. */
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
        if(B.empty()||B.peek()>=x){
            B.push(x);
        }
    }

    public void pop() {
        if(A.pop().equals(B.peek()))B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

public class LeetCode_2034 {
    public static void main(String args[]){
        MinStack m = new MinStack();
        m.push(512);
        m.push(-1024);
        m.push(-1024);
        m.push(512);
        m.pop();
        System.out.println(m.min());
        m.pop();
        System.out.println(m.min());
        m.pop();
        System.out.println(m.min());
    }
}
