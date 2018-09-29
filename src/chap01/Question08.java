package chap01;

import java.util.Scanner;

public class Question08 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값을 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		/*for(int i = 0; i <= n; i++)
		{
			//sum += i;
		}*/
		
		if(n % 2 == 0)
			sum = (1 + n) * (n / 2);
		else
			sum = (1 + n) * (n / 2) + ((n+1)/2);
		
		System.out.println(sum);
	}
}
