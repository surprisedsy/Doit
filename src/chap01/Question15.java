package chap01;

import java.util.Scanner;

public class Question15 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		System.out.print("삼각형의 단 수를 입력하세요 : ");
		int n = sc.nextInt();
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");
		triangleLB(n);
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력");
		triangleLU(n);
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력");
		triangleRB(n);
	}

	
	static void triangleLB(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void triangleLU(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n - i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void triangleRU(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i-1; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= n-i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void triangleRB(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
