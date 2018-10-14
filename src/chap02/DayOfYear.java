package chap02;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	
	static int isLeap(int year)			// 서기 year 년은 윤년인감?(윤년 1 / 평년 0)
	{
		return (year % 4 == 0 && year % 100 != 0
				|| year % 400 == 0) ? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d)
	{
		int days = d;								// 일 수
		
		for(int i = 1; i < m; i++)					// 1월 ~ m-1월의 일수를 더함
		{
			days += mdays[isLeap(y)][i -1];			// 윤년이면 1, 평년이면 0
		}
		return days;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			
			System.out.print("년 : ");
			int year = sc.nextInt();
			
			System.out.print("월 : ");
			int month = sc.nextInt();
			
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예/0.아니오) : ");
			retry = sc.nextInt();
			
		} while(retry == 1);
	}
}
