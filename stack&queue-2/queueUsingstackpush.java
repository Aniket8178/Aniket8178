import java.util.*;
class queueUsingstackpush
{
     LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    int peekele = 0;

     public queueUsingstackpush(){

     }
     //o(1)
     public void push(int x)
     {
          if(st.size() == 0){
          	peekele = x;
          }
          st.addFirst(x);
     }

     public void transfer(LinkedList<Integer> st1,LinkedList<Integer> st2){

     	while(st1.size() != 0)
     	{
     		st2.addFirst(st1.removeFirst());
     	}
     }
     //o(n)
     public int pop()
     {
     	transfer(st , temp);
     	int rele = temp.removeFirst();

     	while(temp.size() != 0)
     	{
     		this.push(temp.removeFirst());
     	}

     	return rele;
     }
     public int peek() {
        return peekele;
     }
    
     public boolean empty() {
         return st.size() == 0;    
     }
     public static void main(String[] args) 
     {
         queueUsingstackpush qusp = new queueUsingstackpush();

         qusp.push(10);
         qusp.push(20);
         qusp.push(30);
         qusp.push(40);
         qusp.push(50);
         qusp.push(60);

         System.out.println(qusp.pop());

         System.out.println(qusp.peek());
         System.out.println(qusp.pop());
           System.out.println(qusp.peek());

         System.out.println(qusp.empty());

     }

}