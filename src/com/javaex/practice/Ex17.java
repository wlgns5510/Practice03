package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int x=num; x>=0; x--) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();

	}

}
