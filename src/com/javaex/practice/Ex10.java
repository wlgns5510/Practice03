package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int c,num;
		int m=0;
		for(c = 1; c <=5; c++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			if(num >= m) {
				m = num;
			}
		}
		System.out.println(m);
		sc.close();

	}

}
