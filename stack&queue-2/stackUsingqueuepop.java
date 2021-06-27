import java.util.*;
class stackUsingqueuepop
{
	 LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    int topele = 0;

    public stackUsingqueuepop(){

    }
    public void transfer(LinkedList<Integer> st1 , LinkedList<Integer> st2)
    {
        while(st1.size() != 0)
        {
            st2.addLast(st1.removeFirst());
        }
    }
    
    //o(n)
    public void push(int x)
    {
        
        temp.addLast(x);
        transfer(st , temp);

        LinkedList<Integer> temp1 = st;
        st = temp;
        temp = temp1;

    }
    //o(1)
    public int pop()
    {
    	return st.removeFirst();
    }
    public int top()
    {
    	return st.getFirst();
    }
    public boolean empty()
    {
    	return st.size() == 0;
    }
    public static void main(String[] args) {
    	
    	stackUsingqueuepop qusp = new stackUsingqueuepop();

         qusp.push(10);
         qusp.push(20);
         qusp.push(30);
         qusp.push(40);
         qusp.push(50);
         qusp.push(60);

         System.out.println(qusp.pop());

         System.out.println(qusp.top());
         System.out.println(qusp.pop());
           System.out.println(qusp.top());

         System.out.println(qusp.empty());
    }

}