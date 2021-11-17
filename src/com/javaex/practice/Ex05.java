package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}
		
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5 <<5까지 출력해내고 그 제서야 flag 는 false 상태로 마주한다.
		 */
		
	}

}
