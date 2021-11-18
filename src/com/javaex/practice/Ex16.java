package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			int five = 0;
			
			for(int i=1; i<=num; i++) {
				if(i%5==0) {
				five=five+i;
				}
			}
			
			System.out.println("5의 배수의 개수 : 는 어케구함요?");
			System.out.println("5의 배수의 합 : "+five);
			
		sc.close();
	}

}
