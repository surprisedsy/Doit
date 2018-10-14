package chap02;

import java.util.Scanner;

public class Question04 {
	
	static void copy(int[] a, int[] b)
	{	
		a = b.clone();
			
		System.out.println("배열 a : ");
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] : " + a[i]);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟값 : ");
		int numb = sc.nextInt();		
		int[] b = new int[numb];
		int[] a = null;
		
		for(int i = 0; i < numb; i++)
		{
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
	}
	
}
