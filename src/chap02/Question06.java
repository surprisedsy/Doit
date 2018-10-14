package chap02;

import java.util.Scanner;

public class Question06 {
	
	static int cardConv(int x, int r, char[] d)
	{
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			
			for(int i = digits; i > 0; i--)		// 입력 위치 하나씩 미룸
			{
				d[i] = d[i-1];
			}
			
			d[0] = dchar.charAt(x % r);
			x /= r;									// x = x / r 이라는 뜻
			digits++;
			
		}while(x != 0);
		
		return digits;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int jinsu;
		int changeNum;
		int retry;
		char[] charNum = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				num = sc.nextInt();
				
			}while(num < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				jinsu = sc.nextInt();
				
			}while(jinsu < 2 || jinsu > 36);
			
			changeNum = cardConv(num, jinsu, charNum);
			
			System.out.print(jinsu + "진수로는 ");
			
			for(int i = 0; i < changeNum; i++)
			{	
				System.out.print(charNum[i]);
			}
			
			System.out.println("입니다.");
			
			System.out.print("한번 더 할까요? (1.예/2.아니오) : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
	}
	
}
