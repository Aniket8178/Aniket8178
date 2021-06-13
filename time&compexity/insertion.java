public class insertion
{

	 public static void swap(int[] arr, int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }

	 public static void insertionsort(int[] arr)
	 {
	 	 int n = arr.length;

	 	 for(int i = 0; i < n; i++)
	 	 {
	 	 	for(int j = i; j > 0; j--)
	 	 	{
	 	 		if(arr[j - 1] > arr[j])
	 	 		{
	 	 			swap(arr,j -1 , j);
	 	 		}
	 	 		else
	 	 		{
	 	 			break;
	 	 		}
	 	 	}
	 	 }
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
	     int[] arr = {5,1,4,2,3,8,9,-1};
	     display(arr);
	     insertionsort(arr);
	     display(arr);

	 }
}