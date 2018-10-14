package chap01;

import java.util.Scanner;

public class Question14 {
	
	public static void main(String[] args)
	{
		System.out.println("사각형을 출력합니다.");
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("�� �� : ");
		int length = sc.nextInt();
		
		for(int i = 1; i <= length; i++ )
		{	
			for(int j = 1; j <= length -1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
