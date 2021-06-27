import java.util.*;
class queueUsingstackpop
{
	LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public queueUsingstackpop(){

    }

    public void push(int x)
    {
        transfer(st , temp);
        st.addFirst(x);
        transfer(temp , st);
    }
    public void transfer(LinkedList<Integer> st1 , LinkedList<Integer> st2)
    {
    	while(st1.size() != 0)
    	{
    		st2.addFirst(st1.removeFirst());
    	}
    }
    public int pop()
    {
    	return st.removeFirst();
    }
    public int peek()
    {
    	return st.getFirst();
    }
    public boolean empty() {
        return st.size() == 0;
    }
    public static void main(String[] args) 
    {
         queueUsingstackpop qusp = new queueUsingstackpop();

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