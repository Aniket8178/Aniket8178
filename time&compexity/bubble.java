public class bubble
{

	 public static void swap(int[] arr , int i, int j)
	 {
	 	 int temp = arr[i];
	 	 arr[i] = arr[j];
	 	 arr[j] = temp;
	 }
      // best averge or worst time complexity is -> o(n square);
	 // public static void bubblesort(int[] arr)
	 // {
	 // 	 int n = arr.length;

	 //  //   for(int li = n - 1; li > 0; li--)
	 //  //   {
	 //  //   	for(int i = 1; i <= li; i++)
	 //  //   	{
	 //  //   		if(arr[i - 1] > arr[i])
	 //  //   		{
	 //  //   			swap(arr, i , i-1);
	 //  //   		}
	 //  //   	}
	 //  //   }

	 // }

	 public static void bubblesort_optimize(int[] arr)
	 {
	 	 int n = arr.length;

	 	 for(int li = n - 1; li > 0; li--)
	 	 {
	 	 	boolean isSwapdone = false;
	 	 	 for(int i = 1; i < li; i++)
	 	 	 {
	 	 	 	if(arr[i - 1] > arr[i])
	 	 	 	{
	 	 	 		swap(arr , i , i - 1);
                    isSwapdone = true;
	 	 	 	}
	 	 	 }

	 	 	 if(!isSwapdone)
	 	     {
	 	 	    break;
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
	 }
	 public static void main(String[] args) 
	 {
	 	int[] arr = {-2,3,4,5,6,7,8,9};
	 	display(arr);
	 	System.out.println();
	 	bubblesort_optimize(arr);
	 	display(arr);
	 }
}