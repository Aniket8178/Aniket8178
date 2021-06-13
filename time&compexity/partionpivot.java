public class partionpivot
{
	 public static void swap(int[] arr, int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }

	 public  static void partionoverpiovt(int[] arr, int pivot)
	 {
	 	int n = arr.length;


	 	swap(arr, pivot , n- 1);
        int p = -1;
        int itr = 0;
        int li = n - 1;
	 	while(itr < li)
	 	{
	 		if(arr[itr] <= arr[li])
	 		{
	 			swap(arr, itr , ++p);
	 		}
	 		itr++;
	 	}
	 	swap(arr, ++p , li);
	 }
	 public static void display(int[] arr)
	 {
	 	int n = arr.length;
	 	for(int i = 0; i < n; i++)
	 	{
	 		System.out.print(arr[i] + " ");
	 	}
	 	System.out.println();
	 }
	 public static void main(String[] args) 
	 {
	     int[] arr = {4,3,2,10,12,1,5,6};
	     int pivot = 6;
	     display(arr);
	     partionoverpiovt(arr,pivot);
	     display(arr);	
	 }
}