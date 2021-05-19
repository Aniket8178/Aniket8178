import java.util.*;
public class decode
{
	public static Scanner sc = new Scanner(System.in);

	public static int decodeway(String str , String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}

         int count = 0;
		char ch = str.charAt(0);
		if(ch == '0')
		{
			return 0;
		}

		count += decodeway(str.substring(1) , ans + (char)('a' + ch - '1'));
		if(str.length() > 1)
		{
			int num = (ch - '0') * 10 + (str.charAt(1) - '0');
			if(num <= 26)
			{
				count += decodeway(str.substring(2) , ans + (char)('a' + num - 1));
			}
		}

		return count;
	}
	public static void main(String[] args) 
	{
	     System.out.println(decodeway("11204" , "")	);
	}
}