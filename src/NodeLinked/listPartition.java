package NodeLinked;

/**
 * Created by wanghongjie on 2017/7/16.
 */
public class listPartition {
    public Node listPartition1(Node head, int pivot) {
        if (head == null) {
            return head;
        }
        Node cur = head;
        int i = 0;
        while (cur != null) {
            i++;
            cur = cur.next;

        }
        Node[] nodeArr = new Node[i];
        i = 0;
        cur = head;
        for(i=0;i!=nodeArr.length;i++) {
            nodeArr[i] = cur;
            cur = cur.next;
        }
        arrPartition(nodeArr, pivot);
        for (i=1;i!=nodeArr.length;i++) {
            nodeArr[i - 1].next = nodeArr[i];

        }
        nodeArr[i = 1].next = null;
        return nodeArr[0];
    }

    public void arrPartition(Node[] nodeArr, int pivot) {
        int small = -1;
        int big = nodeArr.length;
        int index = 0;
        while (index != big) {
            if (nodeArr[index].value < pivot) {
                swap(nodeArr, ++small, index++);

            } else if (nodeArr[index].value == pivot) {
                index++;

            }else{
                swap(nodeArr, --big, index);
            }
        }
    }

    public void swap(Node[] nodeArr, int a, int b) {
        Node tmp = nodeArr[a];
        nodeArr[a] = nodeArr[b];
        nodeArr[b] = tmp;

    }
}

