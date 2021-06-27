import java.util.*;
class stackUsingqueuepush
{
	 LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    int topele = 0;

    public stackUsingqueuepush(){

    }
    
    //o(1)
    public void push(int x)
    {
        topele = x;
        st.addLast(x);
    }
    //o(n)
    public int pop()
    {
    	while(st.size() > 1)
    	{
    		temp.addLast(st.removeFirst());
    	}

    	int rele = st.removeFirst();

    	while(temp.size() != 0)
    	{
    		push(temp.removeFirst());
    	}
    	return rele;
    }
    public int top()
    {
    	return topele;
    }
    public boolean empty()
    {
    	return st.size() == 0;
    }
    public static void main(String[] args) {
    	
    	stackUsingqueuepush qusp = new stackUsingqueuepush();

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