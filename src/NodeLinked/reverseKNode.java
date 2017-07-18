package NodeLinked;

import java.util.Stack;

/**
 * Created by wanghongjie on 2017/7/17.
 */
public class reverseKNode {
    public Node reverseKNodes1(Node head, int K) {
        if (K < 2) {
            return head;
        }
        Stack<Node> stack = new Stack<>();
        Node newHead = head;
        Node cur = head;
        Node pre = null;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            stack.push(cur);
            if (stack.size() == K) {

                pre = resign1(stack, pre, next);
                newHead = newHead == head ? cur : newHead;

            }
            cur = next;

        }
        return newHead;
    }
    public Node resign1(Stack<Node> stack ,Node left,Node right) {
        Node cur = stack.pop();
        if (left != null) {
            left.next = cur;

        }
        Node next = null;
        while (!stack.isEmpty()) {
            next = stack.pop();
            cur.next = next;
            cur = next;
        }
        cur.next = right;
        return cur;
    }

    public Node reverseKNodes2(Node head, int K) {
        if (K < 2) {
            return head;
        }
        Node cur = head;
        Node start = null;
        Node next = null;
        Node pre = null;
        int count = 1;
        while (cur != null) {
            next = cur.next;
            if (count == K) {
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                resign2(pre, start, cur, next);
                pre = start;
                count = 0;

            }
            count++;

        }
        return head;
    }

    public void resign2(Node left, Node start, Node end, Node right) {

        Node pre = start;
        Node cur = start.next;
        Node next = null;
        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        if (left != null) {
            left.next = end;

        }
        start.next = right;
    }
}
