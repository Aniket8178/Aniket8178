import java.util.*;
public class maze
{
	public static Scanner sc = new Scanner(System.in);

	public static int mazepath_hv(int sr,int sc,int er, int ec, String ans)
	{
		if(sr == ec && sc == ec)
		{
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		if(sc + 1 <= ec)
		{
			count += mazepath_hv(sr , sc + 1 , er , ec , ans + "h");
		}
		if(sr + 1 <= er)
		{
			count += mazepath_hv(sr + 1 , sc , er , ec , ans + "v");
		}

		return count;
	}
	public static int mazepath_hvd(int sr,int sc,int er, int ec, String ans)
	{
		if(sr == ec && sc == ec)
		{
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		if(sc + 1 <= ec)
		{
			count += mazepath_hvd(sr , sc + 1 , er , ec , ans + "h");
		}
		if(sc + 1 <= er && sr + 1 <= er)
		{
			count += mazepath_hvd(sr + 1, sc + 1, er, ec, ans + "d");
		}
		if(sr + 1 <= er)
		{
			count += mazepath_hvd(sr + 1 , sc , er , ec , ans + "v");
		}

		return count;
	}
	public static int mazepath_multihvd(int sr,int sc,int er, int ec, String ans)
	{
		if(sr == ec && sc == ec)
		{
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for(int jump = 1; sc + jump <= ec; jump++)
		{
			count += mazepath_multihvd(sr , sc + jump , er , ec , ans + "h" + jump);
		}
		for(int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
		{
			count += mazepath_multihvd(sr + jump, sc + jump, er, ec, ans + "d" + jump);
		}
		for(int jump = 1; sr + jump <= er; jump++)
		{
			count += mazepath_multihvd(sr + jump , sc , er , ec , ans + "v" + jump);
		}

		return count;
	}
	public static void main(String[] args) 
	{
	   System.out.println(mazepath_multihvd(1 , 1	 , 2 , 2 , ""));	
	}
}