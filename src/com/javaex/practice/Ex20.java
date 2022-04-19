package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("    [숫자맞추기게임 시작]");
		System.out.println("==========================");
		
		int a = 27;
		while(true) {
			System.out.print(">>");
			int num = sc.nextInt();
			
			
			if(num==a) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				char yn = sc.next().charAt(0);
					if(yn=='y') {
						System.out.println("==========================");
						System.out.println("    [숫자맞추기게임 종료]");
						System.out.println("==========================");
						break;
					}
					else {
						System.out.println("==========================");
						System.out.println("    [숫자맞추기게임 시작]");
						System.out.println("==========================");
						continue;
					}
				
				
			}
			else if(num < a) {
				System.out.println("더 높게");
			}
			else if(num > a) {
				System.out.println("더 낮게");
			}
		}
		
		sc.close();
	}

}
