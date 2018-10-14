package chap02;

public class PrimeNumber3 {

	public static void main(String[] args)
	{
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;							// 2와 3은 소수
		
		for(int n = 5; n <= 1000; n += 2)			// 홀수만 출력
		{
			boolean flag = false;
			
			for(int i = 1; prime[i] * prime[i] <= n; i++)
			{
				counter += 2;
				
				if(n % prime[i] == 0)				// 나눠서 떨어지면 소수 아님
				{
					flag = true;
					break;
				}
			}
			
			if(!flag)								// 마지막까지 나눠서 떨어지지 않음
			{
				prime[ptr++] = n;					// 배열에 소수 저장
				counter++;
			}
		}
		
		for(int i = 0; i < ptr; i++)
		{
			System.out.println(prime[i]);			// 출력
		}
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
	}
	
}
