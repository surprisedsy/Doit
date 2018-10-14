package chap01;

import java.util.Scanner;

public class Question11 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int result;
				
		do {
			
			System.out.print("a값 입력 : ");
			a = sc.nextInt();
			
			if(a > 0)
				break;
			
			System.out.println("양수를 입력하세요.");
			
		}while(a<=0);
				
		result = (int)(Math.log10(a)+1);
		
		System.out.println("그 수는 " + result + "자리입니다.");
	}
}
