public class fold
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
	  public void fold()
	  {
	  	  Node mid = midnode(head);
	  	  Node nhead = mid.next;
	  	  mid.next = null;

	  	  nhead = reverse(nhead);

	  	  Node c1 = head;
	  	  Node c2 = nhead;

	  	  while( c2 != null)
	  	  {
	  	  	 Node f1 = c1.next;
	  	  	 Node f2 = c2.next;

	  	  	 c1.next = c2;
	  	  	 c2.next = f1;

	  	  	 c1 = f1;
	  	  	 c2 = f2;
	  	  }

	  	  if(size() % 2 != 0)
	  	  {
              tail = mid;
	  	  }
	  	  else
	  	  {
	  	  	 tail = mid.next;
	  	  }
	  }
	  public static void main(String[] args) 
      {
          fold oe = new fold();

          oe.addlast(1);
          oe.addlast(2);
          oe.addlast(3);
          oe.addlast(4);
          oe.addlast(5);
          oe.addlast(6);
          oe.addlast(7);
          //oe.addlast(6);

          oe.display();
          System.out.println();
          oe.fold();
          oe.display();	
      }


}