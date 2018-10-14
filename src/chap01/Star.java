package chap01;

import java.util.Scanner;

public class Star {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("단 수 : ");
		n = sc.nextInt();
		
		diamond(n);
		System.out.println("===============");
		System.out.println("");
		sandglass(n);
	}
	
	static void diamond(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = n-1; i > 0; i--)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void sandglass(int n)
	{
		for(int i = n; i > 0; i--)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 2; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
