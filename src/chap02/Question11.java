package chap02;

import java.util.Scanner;

public class Question11 {

	static class YMD
	{
		int y;
		int m;
		int d;
		
		public YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;

			System.out.println(y + "년 " + m + "월 " + d + "일");
		}
		
		public YMD after(int n)
		{
			
			
			System.out.println(n + "일 뒤의 날짜를 반환 : " + (n+this.d) + "일");
			
			return this;
		}
		
		public YMD before(int n)
		{
			
			
			System.out.println(n + "일 앞의 날짜를 반환 : " + (this.d-n) + "일");
			
			return this;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		int y = sc.nextInt();
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("일 : ");
		int d = sc.nextInt();
		
		YMD ydm = new YMD(y, m, d);
		System.out.println("");
				
		System.out.print("n : ");
		int n = sc.nextInt();		
		ydm.after(n);
		ydm.before(n);
	}
}





