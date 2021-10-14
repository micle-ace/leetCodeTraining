import java.lang.reflect.Array;

public class AddTwoNumbers {
    public ListNode create(int[] a){
        ListNode head = new ListNode();
        ListNode nhead = head;
        for (int i=0;i<a.length;i++){
            head.val = a[i];
            head.next = new ListNode();
            head = head.next;
            head.next=null;
        }
        return nhead;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0;
        int num2=0;
        int sum=0;
        int i=1;
        while (l1.next!=null || l2.next!=null){
            if(l1!=null){
                num1 = num1+l1.val*i;
                l1 = l1.next;
            }
            if(l2!=null){
                num2 = num2+l2.val*i;
                l2 = l2.next;
            }
            i=i*10;
        }
        int len = String.valueOf(sum).length();
        //for(int j=0;j<)
        sum=num1+num2;
        System.out.println(sum+"num1"+num1+"num2"+num2+"len"+len);
        return null;

    }
    public static void main(String[] args) {
        int[] a = {4,5,6};
        int[] b = {1,1,1};
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode head = addTwoNumbers.create(a);
        ListNode l2 = addTwoNumbers.create(b);
        addTwoNumbers.addTwoNumbers(head,l2);
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
