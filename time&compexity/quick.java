public class quick
{
	 public static void swap(int[] arr, int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }
	 public static int partionoverpivot(int[] arr, int si, int ei, int pivot)
	 {

	 	  swap(arr, pivot , ei);

	 	  int p = si - 1;
	 	  int itr = si;
	 	  while(itr <= ei)
	 	  {
	 	  	  if(arr[itr] <= arr[ei])
	 	  	  {
	 	  	  	  swap(arr, itr , ++p);
	 	  	  }
	 	  	  itr++;
	 	  }

	 	  return p;
	 }
	 public static void quicksort(int[] arr , int si , int ei)
	 {

	 	  if(si > ei)
	 	  {
	 	  	 return;
	 	  }

	 	  int pivot = (si + ei) / 2;//si,ei we can make any index as pivot.
	 	  int p = partionoverpivot(arr , si , ei , pivot);

	 	  quicksort(arr , si , p - 1);
	 	  quicksort(arr , p + 1 , ei);
	 }
	 public static void main(String[] args) 
	 {
	     int[] arr = {-12,2,7,4,34,23,0,1,-1,-50,16,23,7,4,2,3};
	     quicksort(arr , 0 , arr.length - 1);

	     for(int ele: arr)
	     {
	     	System.out.print(ele + " ");
	     }	
	 }
}