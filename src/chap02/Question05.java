package chap02;

import java.util.Scanner;

public class Question05 {
	
	static void rcopy(int[] a, int[] b)
	{	
		a = b.clone();
		
		System.out.println("배열 a : ");
		for(int i = 0; i < a.length/2; i++)
		{
			int temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}
		
		for(int i =0;i<a.length;i++)
		{
			System.out.println("a[" + i + "] : " + a[i]);	
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("요솟수 : ");
		int numb = sc.nextInt();		
		int[] b = new int[numb];
		int[] a = null;
		
		for(int i = 0; i < numb; i++)
		{
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		rcopy(a, b);
	}
	
}
