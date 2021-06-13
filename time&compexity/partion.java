public class partion
{

	 public static void swap(int[] arr, int i, int j)
	 {
	 	  int temp = arr[i];
	 	  arr[i] = arr[j];
	 	  arr[j] = temp;
	 }
	 // public static void partiononarray(int[] arr , int data)
	 // {

	 // 	 int n = arr.length;
	 // 	 int p = -1;
	 // 	 int itr = 0;
	 // 	 while(itr < n)
	 // 	 {
	 // 	 	 if(arr[itr] <= data)
	 // 	 	 {
	 // 	 	 	swap(arr, itr , ++p);
	 // 	 	 }
	 // 	 	 itr++;
	 // 	 }
	 // }
	 public static void partiononarray2(int[] arr , int data)
	 {

	 	 int n = arr.length;
	 	 int p = n - 1;
	 	 int itr = 0;
	 	 while(itr <= p)
	 	 {
	 	 	 if(arr[itr] <= data)
	 	 	 {
	 	 	 	itr++;
	 	 	 	
	 	 	 }
	 	 	 else
	 	 	 {
                 swap(arr, itr , p--);
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
	     int[] arr = {4,3,2,10,12,1,5,6};
	     int data = 3;
	     display(arr);
	     partiononarray2(arr,data);
	     display(arr);	
	 }
}