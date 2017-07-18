package NodeLinked;

/**
 * Created by wanghongjie on 2017/7/17.
 */
public class removeNodewired {
    public void removeNodeWireda(Node node) {
        if (node == null) {
            return;
        }
        Node next = node.next;
        if (next == null) {
            throw new RuntimeException("can not remove last node.");
        }
        node.value = next.value;
        node.next = next.next;

    }
}
