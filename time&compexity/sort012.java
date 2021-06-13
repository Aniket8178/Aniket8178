public class sort012
{

	   public static void swap(int[] arr ,int i, int j)
	   {
	   	    int temp = arr[i];
	   	    arr[i] = arr[j];
	   	    arr[j] = temp;
	   }

	  public static void sorting(int[] arr)
	  {
	  	   int n = arr.length;
	  	   int p1 = -1;
	  	   int p2 = n - 1;
	  	   int itr = 0;
	  	   while(itr <= p2)
	  	   {
	  	   	    if(arr[itr] == 0)
	  	   	    {
	  	   	    	
	  	   	    	swap(arr,itr , ++p1);

	  	   	    }
	  	   	    else if(arr[itr] == 2)
	  	   	    {
	  	   	    	swap(arr , itr, p2--);
	  	   	    }
	  	   	    else
	  	   	    {
	  	   	    	itr++;
	  	   	    }
	  	   }
	  }
	  public static void dispaly(int[] arr)
	  {
	  	  for(int i = 0; i < arr.length; i++)
	  	  {
	  	  	   System.out.print(arr[i] + " ");
	  	  }
	  }
	  public static void main(String[] args) {
	  	
	  	 int[] arr = {0,0,1,2,0,1,2,1,1,1,0,2,2};
	  	 dispaly(arr);
	  	 System.out.println();
	  	 sorting(arr);
	  	 dispaly(arr);
	  }
}