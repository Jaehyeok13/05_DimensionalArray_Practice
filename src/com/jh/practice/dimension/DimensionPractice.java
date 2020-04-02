package com.jh.practice.dimension;

import java.util.Random;

public class DimensionPractice {

	public void practice1() {
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 "(0,0)"과 같은 형식으로 저장 후 출력하세요.
		System.out.println("===== 3행3열 (0,0) ~(2,2) 출력문 =====");
		int[][] arrays = new int[3][3];
		
		for(int i = 0; i < arrays.length; i++) {
			for(int j = 0; j < arrays[i].length; j++) {
				System.out.printf("%d,%d\t",i,j);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.
		System.out.println("===== 4행4열 1 ~ 부터 증감문 출력문 =====");
		
		int[][] num = new int[4][4];
		int result = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = ++result;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.printf("%2d\t", num[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		// practice2번의 메소드에서 16 부터 1값을 거꾸로 출력하라.
		System.out.println("===== 4행4열 끝부터 1씩 감소문 출력문 =====");
		int num[][] = new int[4][4];
		int result = 0;
		
		// 배열의 총길이 구해 온다.
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				result = result + 1;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = result--;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.printf("%2d\t", num[i][j]);
			}
			System.out.println();
		}
//		두가지 방법있음
//		for(int i = num.length-1; i >= 0;  i--) {
//			for(int j = num[i].length-1; j >= 0; j--) {
//				num[i][j] = result--;
//			}
//		}
//		
//		for(int i = num.length-1; i >= 0;  i--) {
//			for(int j = num[i].length-1; j >= 0; j--) {
//				System.out.printf("%2d\t", num[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	public void practice4() {
		/*
		 * 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 
		 * 아래의 내용처럼 처리하세요.
		 */
		System.out.println("===== 4행4열 2,2 까지 랜덤수 그후 각행 ,열 합값 3,3 총합 출력문 =====");
		Random rd = new Random();
		int[][] array = new int[4][4];
		int num = 0;
		int column = 0;
		int row = 0;
		
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				num =  rd.nextInt(10) + 1;
				if(i < 3 && j < 3) {
					array[i][j] =num;
					column += num;
				}else if(i < 3 && j == 3) {
					array[i][j] = column;
				}
				if(i == 3 ) {
					row += num;
				}
				
			}
			column = 0;
			row = 0;
//			array[i][3] = column;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d\t",array[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
