package chap03;

import java.util.Scanner;

public class Question03 {

	static int searchIndx(int[] a, int n, int key, int[] idx) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				idx[count++] = i;
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();

		int idx = searchIndx(x, num, ky, a);

		if (idx == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else {

			for (int i = 0; i < idx; i++) {
				System.out.println(ky + "은(는) x[" + a[i] + "]에 있습니다.");
			}

		}

	}

}
