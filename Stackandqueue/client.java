public class client
{
	public static void stackTest() throws Exception {
        stack st = new stack(10);

        for (int i = 1; i <= 10; i++)
            st.push(i * 10);

        System.out.println(st);
        while (st.size() != 5) {
            System.out.println(st.pop());
        }
    }
	public static void main(String[] args) throws Exception
	{
		stackTest();
	    // stack st = new stack(10);

	    //  for(int i = 1; i <= 10; i++)
	    //  {
	    //  	 st.push(i * 10);
	    //  }
	    //  System.out.println(st.top());	

	    //  while(st.size() != 0)
	    //  {
	    //  	System.out.println(st.pop());
	    //  }
	    // queue qu = new queue();

	    // // for(int i = 1; i <= 5; i++)
	    // // {
	    // // 	qu.add(i*10);
	    // // }
	    // qu.add(10);
	    // qu.add(20);
	    // qu.remove();
	    // qu.add(30);
	    // qu.add(40);
	    // qu.remove();
	    // qu.remove();
	    // qu.add(80);
	    // qu.add(12);
	    // System.out.println(qu);

	}
}