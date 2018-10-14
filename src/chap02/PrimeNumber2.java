package chap02;

public class PrimeNumber2 {
	
	public static void main(String[] args)
	{
		int counter = 0;
		int ptr = 0;		// 찾은 소수의 갯수
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n+=2)
		{
			int i;
			
			for(i = 1; i < ptr; i++)		// 찾은 소수로 나누어 봄
			{
				counter++;
				
				if(n % prime[i] == 0)		// 나눠서 나머지가 0이면 소수가 아님
					break;					// 계산 그만
			}
			
			if(ptr == i)					// 마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n;			// 배열에 소수를 저장
		}
		
		for(int i = 0; i < ptr; i++)
			System.out.println(prime[i]);	// 찾은 소수의 갯수 나타냄
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
	
}
