import java.util.*;

public class stackUsingjavaLL
{
     public static class stack
     {
          private LinkedList<Integer> ll = new LinkedList<>();

          public int size()
          {
          	  return this.ll.size();
          }

          public boolean isEmpty()
          {
          	  return this.ll.isEmpty();
          }

          public void push(int data)
          {
          	   ll.addFirst(data);
          }

          public int top()
          {
          	   return ll.getFirst();
          }

          public int pop()
          {
          	  return ll.removeFirst();
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