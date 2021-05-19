import java.util.*;
public class stair
{
	public static Scanner sc = new Scanner(System.in);

	public static int stairpath(int n ,String ans)
	{
		if( n == 0)
		{
			System.out.println(ans + " ");
			return 1;
		}

        int count = 0;
		for(int jump = 1; jump <= 3 && n - jump >= 0; jump++)
		{
			count += stairpath(n - jump , ans + jump);
		}

		return count;
	}
	public static void main(String[] args) 
	{
	     int n = sc.nextInt();
	     System.out.println(stairpath(n , " "));	
	}
}