public class target
{
	 public static void swap(int[] arr , int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }

	 public static int segrgate(int[] arr, int si , int ei , int pivot)
	 {

	 	  swap(arr , pivot , ei);
	 	  
	 	  int p = si - 1;
	 	  int itr = si;
	 	  while(itr <= ei)
	 	  {
	 	  	  if(arr[itr] <= arr[ei])
	 	  	  {
	 	  	  	  swap(arr , itr , ++p);
	 	  	  }
	 	  	  itr++;
	 	  }

	 	  return p;
	 }

	 public static void quicksort(int[] arr, int si , int ei)
	 {
	 	 if(si > ei)
	 	 {
	 	 	return;
	 	 }

	 	 int pivot = ei;
	 	 int pidx = segrgate(arr , si , ei , pivot);

	 	 quicksort(arr, si , pidx - 1);
	 	 quicksort(arr , pidx + 1 , ei);
	 }

	 public static void targetsumpair(int[] arr, int target)
	 {

	 	  int n = arr.length;
	 	  quicksort(arr , 0 , n - 1);

	 	  int si = 0;
	 	  int ei = n - 1;
	 	  while(si < ei)
	 	  {
	 	  	  int sum = arr[si] + arr[ei];
	 	  	  if(sum == target)
	 	  	  {
	 	  	  	  System.out.println(arr[si++] +", "+arr[ei--]);
	 	  	  }
	 	  	  else if(sum < target)
	 	  	  {
	 	  	  	  si++;
	 	  	  }
	 	  	  else
	 	  	  {
	 	  	  	 ei--;
	 	  	  }
	 	  }
	 }
	 public static void main(String[] args)
	 {
	     int[] arr = {-12,2,60,4,34,23,76,1,-1,-50,100,23,7,84,2,3};
	     int target = 160;
	     targetsumpair(arr, target);

	 }
}