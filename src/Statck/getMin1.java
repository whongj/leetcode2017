package Statck;

import java.util.Stack;

/**
 * Created by ${wanghongjie} on 2017/7/4.
 */
public class getMin1 {
    private Stack<Integer> stacknow;
    private Stack<Integer> stackmin;

    public getMin1(Stack<Integer> stacknow,Stack<Integer> stackmin) {
        this.stacknow = stacknow;
        this.stackmin = stackmin;
    }

    public void push(int i) {
        if (stackmin.empty()||i<stackmin.peek()) {
            stackmin.push(i);
        }
        stacknow.push(i);

    }
    public int pop(){
        if(this.stacknow.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        int value = this.stacknow.pop();
        if(value==this.getmin())
        {
            this.stackmin.pop();
        }
        return value;
    }
    public int getmin(){
        if (this.stackmin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackmin.peek();
    }
}
