package chap01;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("´Ü ¼ö : ");
		n = sc.nextInt();
		
		npira(n);
	}
	
	static void npira(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++)
			{
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
