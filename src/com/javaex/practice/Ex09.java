package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		int x,y;
		for(y=0; y<=9; y++) {
			for(x=y+1; x<=10+y; x++) {
				System.out.print(x+"\t");
			}
			System.out.println("");
		}

	}

}
