public class oddeven
{

     private class Node
     {
         int data = 0;
         Node next = null;;
        
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
     public  void addlast(int data)
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
     public void oddevensegrgate()
     {
     	 if(this.size == 0 || this.size == 1)
     	 {
     	 	 return;
     	 }
     	 Node even = new Node(-1);
     	 Node ep = even;

     	 Node odd = new Node(-1);
     	 Node op = odd;
     	 Node curr = this.head;

     	 while(curr != null)
     	 {
     	 	if(curr.data % 2 == 0)
     	 	{
     	 		ep.next = curr;
     	 		ep = ep.next;
     	 	}
     	 	else
     	 	{
     	 		op.next = curr;
     	 		op = op.next;
     	 	}
     	 	curr = curr.next;
     	 }

     	 op.next = even.next;
     	 ep.next = null;

     	 this.head = odd.next;

     }
     public static void main(String[] args) 
     {
          oddeven oe = new oddeven();

          oe.addlast(7);
          oe.addlast(10);
          oe.addlast(2);
          oe.addlast(9);
          oe.addlast(11);
          oe.addlast(12);
          oe.addlast(15);
          oe.addlast(18);

          oe.display();
          System.out.println();
          oe.oddevensegrgate();
          oe.display();	
     }
}