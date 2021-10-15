import com.sun.org.apache.xml.internal.serializer.ToStream;

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
        int[] arr=null;
        ListNode head= null;
        ListNode rh = head;
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
        sum=num1+num2;
        String temp= Integer.toString(sum);
        String temp2;
        int temp3;
        System.out.println(temp.length());
        System.out.println(sum+"num1"+num1+"num2"+num2);

        for(int j=0; j<=temp.length(); j++) {
            if (j!=temp.length()) {
                temp2 = temp.substring(j, j+1);
            } else {
                temp2 = temp.substring(j);
                //System.out.println(i);
            }
            temp3 =  Integer.parseInt(temp2);
            arr[j] = temp3;
        }


        return create(arr);
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
