package chap01;

import java.util.Scanner;

public class Question10 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		int b;
		
		int result = 0;
		
		do {
			
			System.out.print("b�� �� : ");
			b = sc.nextInt();
			
			if(b > a)
				break;
			
			System.out.println("a���� ū ���� �Է��ϼ���!");
						
		}while(a>=b);
		
		result = (b - a);
		
		System.out.println("b-a�� " + result + "�Դϴ�.");
		
	}
	
}
