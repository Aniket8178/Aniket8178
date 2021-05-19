import java.util.*;
public class sequence
{
	public static Scanner sc = new Scanner(System.in);

	public static int sequencepath(String que , String ans)
	{
		if(que.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		char ch = que.charAt(0);
		String roq = que.substring(1);
		int count = 0;

		count += sequencepath(roq , ans);
		count += sequencepath(roq , ans + ch);

		return count;
	}
	public static int sequencepath_count(String que , String ans , ArrayList<String> res)
	{
		if(que.length() == 0)
		{
			res.add(ans);
			return 1;
		}
		char ch = que.charAt(0);
		String roq = que.substring(1);
		int count = 0;

		count += sequencepath_count(roq , ans , res);
		count += sequencepath_count(roq , ans + ch , res);

		return count;
	}
	public static void main(String[] args) 
	{
		ArrayList<String> ans = new ArrayList<>();
	     System.out.println(sequencepath_count("abc" , " " , ans));
	     System.out.println(ans);
	}
}