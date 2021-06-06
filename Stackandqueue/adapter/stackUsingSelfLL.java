import java.util.*;

public class stackUsingSelfLL
{
     public static class stack
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

          public void push(int data)
          {
          	addFirst(data);
          }

          public int top()
          {
          	   return this.head.data;
          }

          public int pop()
          {
          	  return removeFirst().data;
          }
     }
     public static void main(String[] args)
     {
          stack sul = new stack();

          sul.push(10);
          sul.push(20);
          sul.push(30);
          sul.pop();
          sul.push(40);
          sul.push(50);
          sul.pop();
          sul.push(70);
          sul.push(100);
          
          while(sul.size() != 0)
          {
              System.out.println(sul.pop());	
          }
          
     }
}