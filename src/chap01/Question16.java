package chap01;

import java.util.Scanner;

public class Question16 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("단 수 : ");
		n = sc.nextInt();
		
		spira(n);
	}
	
	static void spira(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++)
			{	
				if(j % 2 == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
