package NodeLinked;

/**
 * Created by wanghongjie on 2017/7/13.
 */
public class DoubleNodeDelete {
    public int value;
    public DoubleNodeDelete last;
    public DoubleNodeDelete next;

    public DoubleNodeDelete(int data) {
        this.value = data;
    }

    public DoubleNodeDelete removeLastKthNode(DoubleNodeDelete head, int lastKth) {

        if (head == null || lastKth < 1) {
            return head;
        }
        DoubleNodeDelete cur = head;
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

            }                DoubleNodeDelete newNext = cur.next.next;

            cur.next = newNext;
            if (newNext != null) {
                newNext.last = cur;

            }
        }
        return head;

    }

}
