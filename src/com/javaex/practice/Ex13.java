package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			
			int i=1;
			int sum=0;
			
			while(i<=num) {
				sum=sum+i;
				i++;
			}
			System.out.println("결과값: "+sum);
			
		sc.close();
	}

}
