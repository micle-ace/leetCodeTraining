public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

/*    int val;
    ListNode next;
    ListNode head = null;
    public ListNode(){}

    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val, ListNode listNode){}

    public ListNode gethead(ListNode head){
        head.next=null;
        return head;
    }

    public ListNode create(int val,ListNode listNode){
        listNode.next = new ListNode(val);
        ListNode next = listNode.next;
        next.next = null;
        return listNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(65, new ListNode(56));
        head = head.create(65, head);
        head = head.next;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }*/
}
