package chap01;

import java.util.Scanner;

public class Question09 {
	
	static int sumof(int a, int b)
	{			
		int sum = 0;
		
		if(b % 2 == 0)
			sum = (a + b) * (b / 2);
		else
			sum = (a + b) * (b / 2) + ((b+1)/2);
		
		System.out.println("a에서 b까지의 합계는 " + sum + "입니다.");
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요 : ");
		int b = sc.nextInt();
		
		sumof(a, b);
	}
}
