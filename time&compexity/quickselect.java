public class quickselect
{

	 public static void swap(int[] arr, int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }

	 public static int segrgate(int[] arr, int pivot , int si , int ei)
	 {

	 	  swap(arr , pivot , ei);

	 	  int p = si - 1;
	 	  int itr = si;
	 	  while(itr <= ei)
	 	  {
	 	  	  if(arr[itr] <= arr[ei])
	 	  	  {
	 	  	  	 swap(arr , ++p , itr);
	 	  	  }
	 	  	  itr++;
	 	  }

	 	  return p;
	 }
	 public static void quickSelect(int[] arr , int si , int ei , int idx)
	 {
	 	  if(si > ei)
	 	  {
	 	  	return;
	 	  }

	 	  int pivot = ei;
	 	  int pidx = segrgate(arr , pivot , si , ei);

	 	  if(pidx == idx)
	 	  {
	 	  	 return;
	 	  }
	 	  else if(idx > pidx )
	 	  {
	 	  	 quickSelect(arr , pidx + 1 , ei , idx);
	 	  }
	 	  else
	 	  {
	 	  	  quickSelect(arr , si , pidx - 1, idx);
	 	  }
	 }
	 public static int quickSelect(int[] arr , int k)
	 {
	 	 int n = arr.length;
	 	 int idx = n - k;
	 	 quickSelect(arr , 0 , n - 1, idx);

	 	 return arr[idx];
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
	     int[] arr = { -12, 2, 7, 4, 34, 23, 0, 1, -1, -50, 16, 23, 7, 4, 2, 3 };
         int k =4 ;
         display(arr);
         System.out.println(quickSelect(arr, k));	
	 }
}