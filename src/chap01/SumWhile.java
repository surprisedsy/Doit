package chap01;

import java.util.Scanner;

public class SumWhile {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n)
		{
			sum += i;
			i++;
		}
		
		System.out.println("변수 i의 값은 " + i + "이고 i는 " + n + " + 1 의 값 입니다.");
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
	}
	
}
