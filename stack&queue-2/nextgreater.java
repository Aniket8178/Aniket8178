import java.util.*;
public class nextgreater
{
	public static Scanner sc = new Scanner(System.in);

	public static void nextgreaterelement(int[] arr)
	{
		int n = arr.length;
		int[] ans = new int[n];
		Arrays.fill(ans , -1);
		LinkedList<Integer> st = new LinkedList<>();
        for(int i = 0; i < n; i++)
        {
        	while(st.size() != 0 && arr[st.getFirst()] < arr[i])
        	{
        		ans[st.removeFirst()] = arr[i];
        	}
        	st.push(i);
        }

        for (int ele : ans) 
        {
           System.out.println(ele);	
        }
	}
	public static void main(String[] args) 
	{
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i = 0; i < n; i++)
	   {
            arr[i] = sc.nextInt();
	   }	
	   nextgreaterelement(arr);
	}
}