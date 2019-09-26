import java.util.Scanner;

public class Solution
{
	public static String solve(int N, String Lpath)
	{
		int e = 0;
		int s = 0;
		
		Lpath = Lpath.replace('E', 'A');
		Lpath = Lpath.replace('S', 'Q');
		Lpath = Lpath.replace('A', 'S');
		Lpath = Lpath.replace('Q', 'E');
		
		return Lpath; //PLACEHOLDEr
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int N;
		String Lpath;
		String Mpath;
		for(int i = 0; i < T; i++)
		{
			N = input.nextInt();
			Lpath = input.next();
			Mpath = solve(N, Lpath);
			System.out.println("Case #" + (i+1) + ": " + Mpath);
		}
	}
	
}
