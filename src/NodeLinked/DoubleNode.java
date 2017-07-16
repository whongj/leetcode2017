package NodeLinked;

/**
 * Created by wanghongjie on 2017/7/15.
 */
public class DoubleNode {
    public int value;
    public DoubleNode last;
    public DoubleNode next;

    public DoubleNode(int data) {
        this.value = data;

    }
    public DoubleNode removeLastKthNode(DoubleNode head, int lastKth) {

        if (head == null || lastKth < 1) {
            return head;
        }
        DoubleNode cur = head;
        while(cur != null){
            lastKth--;
            cur = cur.next;
        }
        if (lastKth == 0) {
            head = head.next;
            head.last = null;
        }
        if(lastKth<0){
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;

            }                DoubleNode newNext = cur.next.next;

            cur.next = newNext;
            if (newNext != null) {
                newNext.last = cur;

            }
        }
        return head;

    }

    public DoubleNode reverseList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;

        }
        return pre;
    }

}
