package chap02;

import java.util.Scanner;

public class Question02 {
	
	static void swap(int[] a, int idx1, int idx2)
	{
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	static void reverse(int[] a)
	{
		for(int i = 0; i <= a.length/2; i++)
		{
			System.out.println("\na[" + i + "]과(와) a[" + (a.length-i) + "]교환합니다." );
			swap(a, i, a.length-i-1);
		}
			
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++)
		{
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("\n역순 정렬을 마쳤습니다.");
	}
	
}
