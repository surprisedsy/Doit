package chap02;

import java.util.Scanner;

public class Question03 {
	
	static int sumOf(int[] a)
	{
		int result = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			result += a[i];
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++)
		{
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("sum = " + sumOf(x));
		
	}
	
}
