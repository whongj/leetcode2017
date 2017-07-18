package NodeLinked;

import java.util.HashMap;

/**
 * Created by wanghongjie on 2017/7/16.
 */
public class CopyListWithRand {
    public RandNode copyListWithRand1(RandNode head) {
        HashMap<RandNode, RandNode> map = new HashMap<>();
        RandNode cur = head;
        while (cur != null) {
            map.put(cur, new RandNode(cur.value));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;

        }
        return map.get(head);
    }

}
