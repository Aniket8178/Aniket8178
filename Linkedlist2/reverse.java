public class reverse
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
	  public void reverselinkedlist()
	  {
	  	   
	  	   

	  	   Node curr = this.head;
	  	   Node prev = null;

	  	   while(curr != null)
	  	   {
	  	   	   Node frwd = curr.next;

	  	   	   curr.next = prev;

	  	   	   prev = curr;
	  	   	   curr = frwd;
	  	   }

	  	   this.tail = this.head;
	  	   this.head = prev;

	  }
	  public static void main(String[] args) 
      {
          reverse oe = new reverse();

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
          oe.reverselinkedlist();
          oe.display();	
      }


}