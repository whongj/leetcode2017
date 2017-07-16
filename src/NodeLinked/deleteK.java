package NodeLinked;

/**
 * Created by wanghongjie on 2017/7/13.
 */
public class deleteK {
    public int value;
    public deleteK next;

    public deleteK(int data) {
        this.value = data;

    }

    public deleteK removeLastKthNode(deleteK head, int lastKth) {

        if (head == null || lastKth < 1) {

            return head;
        }
        deleteK cur = head;
        while (cur != null) {
            lastKth--;
            cur = cur.next;

        }
        if (lastKth == 0) {
            head = head.next;

        }
        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;

            }
            cur.next = cur.next.next;

        }
        return head;
    }

}
