package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int x,y;
		for(y=1; y<=9; y++) {
			for(x=2; x<=9; x++) {
				System.out.print(x + "*" + y + "=" + x*y + "\t");
			}
			System.out.println("");
		}

	}

}
