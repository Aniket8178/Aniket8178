public class stack
{
     private int[] arr;
     private int tos;
     private int size;
     private int maxsize;

     private void intilize(int len)
     {
         this.arr = new int[len];
         this.tos = -1;
         this.size = 0;
         this.maxsize = len;
     }

     public stack()
     {
         intilize(5); 
     }
     public stack(int size)
     {
         intilize(size);
     }
     public String toString()
     {
          StringBuilder sb = new StringBuilder();
          sb.append("[");
          for(int i = tos; i >= 0; i--)
          {
          	   sb.append(this.arr[i]);
          	   if(i != 0)
          	   {
          	   	   sb.append(",");
          	   }
          }
          sb.append("]");
          return sb.toString();
     }
     private void stackIsEmptyException()  throws Exception {
         if(this.size == 0)
         {
             throw new Exception("stackIsEmptyException : -1");
         }
     }
     private void stackIsOverFlowException()  throws Exception {
        if(this.size == this.maxsize)
        {
            throw new Exception("stackIsOverFlowException : -1");
        }
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size == 0;
    }
    private void push_(int data)
    {
        this.arr[++this.tos] = data;
        this.size++;
    }
    public void push(int data) throws Exception{
        stackIsOverFlowException();
        push_(data);
    }
    public int top() throws Exception{
        stackIsEmptyException();
        return this.arr[this.tos];
    }
    private int pop_()
    {
        int rmove = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.size--;
        return rmove;
    }
    public int pop() throws Exception{
        stackIsEmptyException();
        return pop_();
    }
}