public class dynamicstack extends stack1
{
     public dynamicstack()
     {
        super();
     }
     public dynamicstack(int data){
        super(data);
     }

     public void push(int data) throws Exception
     {
        if(super.size() == super.maxSize())
        {
            int[] temp = new int[super.size()];
            int idx = super.size() - 1;
            while(super.size() != 0)
            {
                temp[idx--] = super.pop();
            }
            super.initilize(super.maxSize() * 2);

            for(int ele : temp)
            {
                super.push(ele);
            }
        }
        super.push(data);
     }
    

}
