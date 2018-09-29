package chap01;

public class min4 {
	
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		if(min > d)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args)
	{
		System.out.println("min4 = " + min4(0, 1, 2, 3));
		System.out.println("min4 = " + min4(1, 0, 2, 3));
		System.out.println("min4 = " + min4(2, 1, 0, 3));
		System.out.println("min4 = " + min4(3, 1, 2, 0));
	}
	
}
