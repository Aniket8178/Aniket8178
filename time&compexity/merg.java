public class merg
{

      public static int[] mergtwosortedarray(int[] a , int[] b)
      {
      	  if(a.length == 0 || b.length == 0)
      	  {
      	  	  return a.length == 0 ? b : a;
      	  }

      	  int i = 0;
      	  int j = 0;
      	  int k = 0;
      	  int n = a.length;
      	  int m = b.length;
      	  int len = n + m;
      	  int[] ans = new int[len];

      	  while(i < n && j < m)
      	  {
      	  	  if(a[i] < b[j])
      	  	  {
      	  	  	  ans[k++] = a[i++];
      	  	  }
      	  	  else
      	  	  {
      	  	  	  ans[k++] = b[j++];
      	  	  }
      	  }

      	  while(i < n)
      	  {
      	  	  ans[k++] = a[i++];
      	  }

      	  while(j < m)
      	  {
      	  	  ans[k++] = b[j++];
      	  }

      	  return ans;
      }
	  public static int[] mergsort(int[] arr , int si , int ei)
	  {

	  	  if(si == ei)
	  	  {
	  	  	  return new int[] { arr[si] };
	  	  }

	  	   int mid = (si + ei) / 2;

	  	   int[] left = mergsort(arr , si , mid);
	  	   int[] right = mergsort(arr , mid + 1 , ei);

	  	   return mergtwosortedarray(left , right);
	  }
	  public static void main(String[] args) {
        int[] arr = { -12, 2, 7, 4, 34, 23, 0, 1, -1, -50, 16, 23, 7, 4, 2, 3 };
        arr = mergsort(arr, 0, arr.length - 1);

        for (int ele : arr)
            System.out.print(ele + " ");
    }
}