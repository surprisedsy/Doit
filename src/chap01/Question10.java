package chap01;

import java.util.Scanner;

public class Question10 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		int b;
		
		int result = 0;
		
		do {
			
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			
			if(b > a)
				break;
			
			System.out.println("a보다 큰 값을 입력하세요!");
						
		}while(a>=b);
		
		result = (b - a);
		
		System.out.println("b-a는 " + result + "입니다.");
		
	}
	
}
