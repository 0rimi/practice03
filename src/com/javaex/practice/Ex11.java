package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			
			int i=1;
			int odd=-1;
			int even=0;
			int sum=0;
			
			while(i<=(num+1)/2) {//입력받은 숫자까지만 반복할거임
				if(num%2!=0) {//홀수면
					odd=odd+2;//홀수들 i가 1일때 1을 시작으로 함
					sum=sum+odd;//0을 시작으로 홀수들을 더하겠다.
				}
				else if(num%2==0){//짝수면
					even=even+2;//짝수들 i가 1일때 2를 시작으로 함
					sum=sum+even;//0을 시작으로 짝수들을 더하겠다.
				}
				i++;
			}
			System.out.println("결과값 :"+sum);
			
		sc.close();
	}

}
