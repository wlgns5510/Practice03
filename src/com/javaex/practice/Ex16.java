package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int bs=0;
		for(int i=1; i<=num; i++) {
			if(bs<num) {
				bs=i*5;
				System.out.println(bs);
				
			}
			
			
		}		
		bs=bs+bs;
		System.out.println("5의배수의 개수: " + num/5);
		System.out.println("5의배수의 합: " + bs);
		
		sc.close();

	}

}
