package chap01;

import java.util.Scanner;

public class SumFor {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= n; i++)
		{
			sum += i;
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
	
}
