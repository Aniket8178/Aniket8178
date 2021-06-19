 public Node midnode(Node node)
	  {
	  	  if(node == null || node.next == null)
	  	  {
	  	  	  return node;
	  	  }
         
          Node fast = node;
          Node slow = node;
          while(fast.next != null && fast.next.next != null)
          {
          	   slow = slow.next;
          	   fast = fast.next.next;
          }

          return slow;
	  }
	   public Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null || l2 == null)
            return l1 != null ? l1 : l2;

        Node dummy = new Node(-1);
        Node prev = dummy, c1 = l1, c2 = l2;

        while (c1 != null && c2 != null) {
            if (c1.val <= c2.val) {
                prev.next = c1;
                c1 = c1.next;
            } else {
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }

        prev.next = c1 != null ? c1 : c2;

        return dummy.next;
    }
	  public Node sortList(Node head) {
        
        
        if (head == null || head.next == null)
            return head;

        Node mid = midnode(head);
        Node nHead = mid.next;
        mid.next = null;

        Node leftSortedList = sortList(head);
        Node rightSortedList = sortList(nHead);

        return mergeTwoLists(leftSortedList, rightSortedList);
        
    }