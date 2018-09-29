package chap01;

public class max4 {
	
	static int max4(int a, int b, int c, int d)
	{
		int max = a;
		
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args)
	{
		System.out.println("max4 = " + max4(1, 2, 3, 4));
		System.out.println("max4 = " + max4(4, 2, 3, 1));
		System.out.println("max4 = " + max4(1, 4, 3, 2));
		System.out.println("max4 = " + max4(1, 2, 4, 3));
	}
	
}
