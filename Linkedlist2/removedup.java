public class removedup
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
	  public void removeduplicatefromsorted()
	  {
	  	   Node remove = new Node(-1);
	  	   Node rd = remove;

	  	   Node curr = head;
	  	   Node prev = head;

	  	   while(curr != null)
	  	   {
	  	   	   if(curr.data == prev.data)
	  	   	   {
	  	   	   	   curr = curr.next;
	  	   	   }
	  	   	   else
	  	   	   {
	  	   	   	   rd.next = prev;
	  	   	   	   rd = rd.next;
	  	   	   	   prev = curr;
	  	   	   }
	  	   }
	  	   rd.next = prev;
	  	   rd = rd.next;
	  	   rd.next = null;

	  	   this.head = remove.next;

	  }
	  public static void main(String[] args) 
      {
          removedup oe = new removedup();

          oe.addlast(2);
          oe.addlast(2);
          oe.addlast(2);
          oe.addlast(3);
          oe.addlast(3);
          oe.addlast(5);
          oe.addlast(6);
          //oe.addlast(6);

          oe.display();
          System.out.println();
          oe.removeduplicatefromsorted();
          oe.display();	
      }


}