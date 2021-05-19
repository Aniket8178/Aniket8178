import java.util.*;
public class kpc
{
	public static Scanner sc = new Scanner(System.in);

	public static String[] nokiakey = {".;" , "abc" , "def" , "ghi" , "jkl" ,"mno" , "pqrs" , "tu" , "vwx" , "yz" };

	public static int kpc_sqeuence(String str, String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}

		char ch = str.charAt(0);
		int idx = ch - '0';
		String word = nokiakey[idx];
		int count = 0;

		for(int i = 0; i < word.length(); i++)
		{
             count += kpc_sqeuence(str.substring(1) , ans + word.charAt(i));
		}

		return count;

	}
	public static void main(String[] args) 
	{
	   System.out.println(kpc_sqeuence("467" , ""));
	}
}