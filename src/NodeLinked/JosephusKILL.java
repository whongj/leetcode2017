package NodeLinked;

/**
 * Created by wanghongjie on 2017/7/15.
 */
public class JosephusKILL {
    public Node josephusKill1(Node head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;

        }//为啥要弄这块，因为自己画一遍，数一数就明白为啥了。
        //head 永远比last 前一位，如果要跳过，直接last.NEXT = head.next就Ok了，顺带，可以进行
        int count = 0;
        while (head != last) {
            if (++count == m) {
                last.next = head.next;
                count = 0;
            } else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }

    public Node josephusKill2(Node head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        Node cur = head.next;
        int tmp = 1;//tip -> list size
        while (cur != head) {
            tmp++;
            cur = cur.next;

        }
        tmp = getLive(tmp, m);//tmp -> service node position
        while (--tmp != 0) {
            head = head.next;
        }
        head.next = head;
        return head;
    }

    public int getLive(int i, int m) {
        if (i == 1) {
            return 1;
        }
        return (getLive(i - 1, m) + m - 1) % i + 1;
    }

}
