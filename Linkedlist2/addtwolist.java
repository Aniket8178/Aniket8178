import java.util.*;

class addtwolist {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverselist(ListNode head)
    {
    	if(head == null || head.next == null)
    	{
    		return head;
    	}

    	ListNode prev = null;
    	ListNode curr = head;

    	while(curr != null)
    	{
    		ListNode forw = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = forw;
    	}

    	return prev;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	l1 = reverselist(l1);
    	l2 = reverselist(l2);

    	ListNode dummy = new ListNode(-1);

    	ListNode c1 = l1;
    	ListNode c2 = l2;
    	ListNode prev = dummy;
    	int carry = 0;

    	while(c1 != null || c2 != null || carry != 0)
    	{
    		int sum = carry + (c1 != null ? c1.val : 0) + (c2 != null ? c2.val : 0);
             
             carry = sum / 10;
             sum = sum % 10;


             prev.next = new ListNode(sum);

             prev = prev.next;
             if(c1 != null){
             	c1 = c1.next;
             }
             if(c2 != null){
             	c2 = c2.next;
             }
    	}

    	ListNode head = dummy.next;
    	head = reverselist(head);

    	l1 = reverselist(l1);
    	l2 = reverselist(l2);
        return head;
    }

    // InFput_code===================================================

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode makeList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = makeList(scn.nextInt());
        ListNode head2 = makeList(scn.nextInt());

        ListNode ans = addTwoNumbers(head1, head2);
        printList(ans);
    }

}