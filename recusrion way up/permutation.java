import java.util.*;
public class permutation
{
	public static Scanner sc = new Scanner(System.in);

	public static int possiblepermutation(String str,String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			String roq = str.substring( 0 , i) + str.substring(i + 1);
			count += possiblepermutation(roq , ans + str.charAt(i));
		}

		return count;
	}
	public static int permutationwithoutduplicate(String str,String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		char prev = '$';
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != prev)
			{
				String roq = str.substring( 0 , i) + str.substring(i + 1);
			    count += permutationwithoutduplicate(roq , ans + str.charAt(i));
			}
			prev = str.charAt(i);
		}

		return count;
	}
	public static void permutationwithoutduplicate(String str)
	{
		StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
		for(int i = 0; i < str.length(); i++)
		{
			freq[str.charAt(i) - 'a']++;
		}

		for(int i = 0; i < 26; i++)
		{
			for(int j = 0; j < freq[i]; j++)
			{
				sb.append((char) (i + 'a'));
			}
		}

		System.out.println(permutationwithoutduplicate(sb.toString() , ""));
	}
	public static void main(String[] args) 
	{
	    permutationwithoutduplicate("abab");
	}
}