public class mtsort
{

	 public static int[] mergtwosort(int[] arr1 , int[] arr2)
	 {
	 	  int n = arr1.length;
	 	  int m = arr2.length;
	 	  int i = 0;
	 	  int j = 0;
	 	  int k = 0;
	 	  
	 	  int[] ans = new int[n + m];

	 	  while(i < n && j < m)
	 	  {
              if(arr1[i] < arr2[j])
              {
              	  ans[k] = arr1[i];
              	  i++;
              }
              else
              {
              	  ans[k] = arr2[j];
              	  j++;
              }
              k++;
	 	  }

	 	  while(i < n)
	 	  {
	 	  	  ans[k] = arr1[i];
	 	  	  k++;
	 	  	  i++;
	 	  }
	 	  while(j < m  )
	 	  {
	 	  	 ans[k] = arr2[j];
	 	  	 j++;
	 	  	 k++;
	 	  }

	 	  return ans;
	 }
	 public static void main(String[] args) 
	 {
	      int[] arr1 = {2,3,4,5,6,7,8};
	      int[] arr2 = {0,2,4,8,9};

         int[] res = mergtwosort(arr1 , arr2);
         for(int i = 0; i < res.length; i++)
         {
         	  System.out.print(res[i] + " ");
         }

	 }
}