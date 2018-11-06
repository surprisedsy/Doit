package chap03;

import java.util.Scanner;

public class Question02 {
		
	static int seqSearchSen(int[] a, int n, int key)
	{
		int c = 0;
		int num = 8;		
		int[] x = {6, 4, 3, 2, 1, 9, 8, 0};
		
		System.out.print("   |");
		
		for(int i = 0; i < 7; i++)
			System.out.printf("%3d", i);
		
		System.out.println("\n---+----------------------");
		
		while(true)
		{	
			
			System.out.print("   |");
			
			for(int k = 0; k < 7; k++){
				if(k == c)
					System.out.print("  *");
				else
					System.out.print("   ");
			}
								
			System.out.println("");
						
			System.out.printf("%2d |", c);			
			
			for(int j = 0; j <= n; j++)
			{	 
				
				System.out.printf("  " + x[j], c*j);
			}
			
			System.out.println("");
			
			if(c == n){
				return -1;
			}
			if(a[c] == key){
				return c;
			}
			c++;
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num = 7;		
		int[] x = {6, 4, 3, 2, 1, 9, 8, 0};
		
		System.out.println("{6, 4, 3, 2, 1, 9, 8}");
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
	}
	
}
