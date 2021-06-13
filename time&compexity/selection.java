public class selection
{

	 public static void swap(int[] arr, int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }

	 public static void selectionsort(int[] arr)
	 {
	 	 // int n = arr.length;

	 	  int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    swap(arr, i, j);//minIdx = j;
                
            }
            //swap(arr, i, minIdx);
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
	     selectionsort(arr);
	     display(arr);

	 }
}