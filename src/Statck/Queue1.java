package Statck;
import java.util.Stack;

/**
 * Created by ${wanghongjie} on 2017/7/4.
 */
public class Queue1 {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public Queue1() {
        stackPop = new Stack<Integer>();
        stackPush = new Stack<Integer>();

    }

    public void add(int pushInt) {

        stackPush.push(pushInt);

    }

    public int poll() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("QUEUE is empty");
        } else if (stackPop.empty()) {

            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}