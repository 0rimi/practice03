package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			//뽀록임
			for(int y=num; y<=num&&y>0; y--) {
				for(int x=y; x<=y&&x>0; x--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for(int y=2; y<=num; y++) {
				for(int x=1; x<=y; x++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
			
			
			/*
			for(int y=num*2; y<=num*2&&y>0; y--) {
				for(int x=y/2; x<=y/2&&x>0; x--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			*/
			
		sc.close();
	}

}
