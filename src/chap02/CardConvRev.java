package chap02;

import java.util.Scanner;

public class CardConvRev {
	
	static int cardConvR(int x, int r, char[] d)
	{
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(r + "|" + "\t" + x);
		System.out.println("+ ---------");
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
		}while(x != 0);
		
		return digits;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int no, cd, dno, retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
				
			}while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
				
			}while(cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			
			for(int i = dno -1; i >= 0; i--)
				System.out.print(cno[i]);
			
			System.out.println("입니다.");
			
			
			System.out.print("한번 더 할까요? (1.예/2.아니오) : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
	}
}
