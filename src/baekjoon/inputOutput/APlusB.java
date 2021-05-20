package baekjoon.inputOutput;

import java.util.Scanner;

public class APlusB {
	public static void main(String[] args) {
		
		// 1. Scanner 사용
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println(a+b);
		
		sc.close();
		
	}
}
