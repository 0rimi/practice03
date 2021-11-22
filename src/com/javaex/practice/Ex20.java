package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("==================================");
			System.out.println("\t"+"[숫자맞추기게임 시작]");
			System.out.println("==================================");
			
			int ans = (int)(Math.random()*(100-1+1)+1); //정답~
			int num;
			
			while(true) {
				System.out.print(">>");
				num = sc.nextInt();
				if(num<ans) {
					System.out.println("더 높게");
				}
				else if(num>ans) {
					System.out.println("더 낮게");
				}
				else if(num==ans) {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n)");
					System.out.print("  >>");
					String ox = sc.next();
						if(ox.equals("y")) {
							break;
						}
						else if(ox.equals("n")) {
							ans = (int)(Math.random()*(100-1+1)+1);
							continue;
						}		
				}
			}
			System.out.println("==================================");
			System.out.println("\t"+"[숫자맞추기게임 종료]");
			System.out.println("==================================");
			
		sc.close();
	
	}
}
