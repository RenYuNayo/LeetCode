import java.util.LinkedList;

class CQueue {

    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return -1;
            }
            while (true){
                int v = stack1.pop();
                if(stack1.isEmpty()){
                    return v;
                }
                stack2.push(v);
            }
        }
        return stack2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */

public class LeetCode_2012 {
    public static void main(String args[]){
        CQueue c = new CQueue();
        c.appendTail(3);
        c.appendTail(7);
        c.deleteHead();
        c.appendTail(4);
        c.deleteHead();
    }
}
