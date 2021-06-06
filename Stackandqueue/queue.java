public class queue
{
     private int[] arr;
     private int front;
     private int back;
     private int size;
     private int maxsize;

     private void intilize(int len)
     {
         this.arr = new int[len];
        this.front = 0;
        this.back = 0;
         this.size = 0;
         this.maxsize = len;
     }

     public queue()
     {
         intilize(5); 
     }
     public queue(int size)
     {
         intilize(size);
     }
     public String toString()
     {
     	 StringBuilder sb = new StringBuilder();
     	 sb.append("[");
     	 for(int i = 0; i < this.size; i++)
     	 {
     	 	 int idx = (i + this.front) % this.maxsize;
     	 	 sb.append(this.arr[idx]);

     	 	 if(i != this.size - 1)
     	 	 {
     	 	 	 sb.append(",");
     	 	 }
     	 }
     	 sb.append("]");

     	 return sb.toString();
     }
     private void queueIsEmptyException()  throws Exception {
         if(this.size == 0)
         {
             throw new Exception("queueIsEmptyException : -1");
         }
     }
     private void queueIsOverFlowException()  throws Exception {
        if(this.size == this.maxsize)
        {
            throw new Exception("queueIsOverFlowException : -1");
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
    private void add_(int data)
    {
        this.arr[this.back] = data;
        this.back = (this.back + 1) % this.maxsize;
        this.size++;
    }
    public void add(int data) throws Exception{
        queueIsOverFlowException();
        add_(data);
    }
    public int peek() throws Exception{
        queueIsEmptyException();
        return this.arr[this.front];
    }
    private int remove_()
    {
        int rmove = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front + 1) % this.maxsize;
        this.size--;
        return rmove;
    }
    public int remove() throws Exception{
        queueIsEmptyException();
        return remove_();
    }
}