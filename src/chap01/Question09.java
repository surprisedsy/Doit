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
		
		System.out.println("a���� b������ �հ�� " + sum + "�Դϴ�.");
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("b���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		sumof(a, b);
	}
}
