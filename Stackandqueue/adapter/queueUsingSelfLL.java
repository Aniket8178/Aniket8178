import java.util.*;

public class queueUsingSelfLL
{
     public static class queue
     {
          private class Node
          {
               int data;
               Node next;
               Node(int data)
               {
                    this.data = data;
               }
          }

          private Node head = null;
          private Node tail = null;
          private int size = 0;


          private void addFirst(int data)
          {
               Node newnode = new Node(data);
               if(this.size == 0)
               {
                    this.head = this.tail = newnode;
               }
               else
               {
                    newnode.next = this.head;
                    this.head = newnode;
               }
               this.size++;
          }
          private void addLast(int data)
          {
               Node newnode = new Node(data);
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
          private Node removeFirst()
          {
               Node temp = head;
               if(this.size == 1)
               {
                    this.head = this.tail = null;
               }
               else
               {
                   this.head = temp.next;
                   temp.next = null;
               }

               this.size--;
               return temp;
               //return temp;
          }
          public int size()
          {
          	  return this.size;
          }

          public boolean isEmpty()
          {
          	  return this.size == 0;
          }

          public void add(int data)
          {
          	addLast(data);
          }

          public int peek()
          {
          	return this.head.data;
          }

          public int remove()
          {
          	  return removeFirst().data;
          }
     }
     public static void main(String[] args)
     {
          queue sul = new queue();

          sul.add(10);
          sul.add(20);
          sul.add(30);
          sul.remove();
          sul.add(40);
          sul.add(50);
          sul.remove();
          sul.add(70);
          sul.add(100);
          
          while(sul.size() != 0)
          {
              System.out.println(sul.remove());	
          }
          
     }
}