import java.util.*;
public class board
{
	public static Scanner sc = new Scanner(System.in);

	public static int boardpath(int n ,String ans)
	{
		if( n == 0)
		{
			System.out.println(ans + " ");
			return 1;
		}

        int count = 0;
		for(int dice = 1; dice <= 6 && n - dice >= 0; dice++)
		{
			count += boardpath(n - dice , ans + dice);
		}

		return count;
	}
	public static int boardpathstartend(int sp , int ep ,String ans)
	{
		if( sp == ep)
		{
			System.out.println(ans + " ");
			return 1;
		}

        int count = 0;
		for(int dice = 1; dice <= 6 && sp + dice <= ep; dice++)
		{
			count += boardpathstartend(sp + dice , ep , ans + dice);
		}

		return count;
	}
	public static int boardPathonarray(int[] arr, int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump : arr) {
            if (n - jump >= 0)
                count += boardPathonarray(n - jump, n, ans + jump);
        }

        return count;
    }
	public static void main(String[] args) 
	{
	     
	     int[] arr = {2 , 5 , 3 , 1 };

	     System.out.println(boardPathonarray(arr, 10 , " "));	
	}
}