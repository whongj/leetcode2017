package Statck;

import java.util.Stack;

/**
 * Created by ${wanghongjie} on 2017/7/4.
 */
public class getMin2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackmin;

    public getMin2(Stack<Integer> stackData, Stack<Integer> stackmin) {
        this.stackData = stackData;
        this.stackmin = stackmin;

    }

    public void push(int i) {
        stackData.push(i);
        if (stackmin.isEmpty()) {
            stackmin.push(i);
        } else if (stackmin.peek() <= i){
            stackmin.push(stackmin.peek());
        }

    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }

        this.stackmin.pop();
        return this.stackData.pop();
    }
    public int getmin(){
        if (this.stackmin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackmin.peek();
    }
}
