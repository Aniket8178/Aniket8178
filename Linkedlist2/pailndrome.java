public class pailndrome
{

	  private class Node
	  {
          int data = 0;
          Node next = null;

          Node(int data)
	      {
	  	       this.data = data;
	      }
	  }

	  private Node head = null;
	  private Node tail = null;
	  private int size = 0;

	  public int size()
	  {
	  	  return this.size;
	  }
      private void addlastnode(Node newnode)
      {
      	  if(this.size == 0)
      	  {
      	  	  this.head = this.tail = newnode;
      	  }
      	  else
      	  {
      	  	  this.tail.next = newnode;
      	  	  this.tail = newnode;
      	  }
      	  this.size++;
      }
	  public void addlast(int data)
	  {
	  	  Node newnode = new Node(data);
	  	  addlastnode(newnode);
	  }

	  public void display()
	  {
	  	  Node curr = head;

	  	  while(curr != null)
	  	  {
	  	  	  System.out.print(curr.data + "-->");
	  	  	  curr = curr.next;
	  	  }
	  	  System.out.print("null");
	  }
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
	  
	  public Node reverse(Node node)
	  {
	  	  if(node == null || node.next == null)
	  	  {
	  	  	  return node;
	  	  }

	  	  Node curr = node;
	  	  Node prev = null;
	  	  while(curr != null)
	  	  {
	  	  	  Node frwd = curr.next;
              curr.next = prev;
              prev = curr;
              curr = frwd;
	  	  }

	  	  return  prev;
	  }
	  public boolean IsPalindrome() {
        Node mid = midnode(head);
        Node nHead = mid.next;
        mid.next = null;

        nHead = reverse(nHead);
        Node c1 = head, c2 = nHead;
        boolean isPalindrome = true;
        while (c2 != null) {
            if (c1.data != c2.data) {
                isPalindrome = false;
                break;
            }
            c1 = c1.next;
            c2 = c2.next;
        }

        nHead = reverse(nHead);
        mid.next = nHead;

        return isPalindrome;
    }
	  public static void main(String[] args) 
      {
          pailndrome oe = new pailndrome();

          oe.addlast(1);
          oe.addlast(2);
          oe.addlast(3);
          oe.addlast(2);
          oe.addlast(2);
        

          oe.display();
          System.out.println(oe.IsPalindrome());
         
      }


}