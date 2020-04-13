package com.jh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
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
		int num = 0;	// 랜덤 숫자를 담을 변
		int column = 0;	// 마지막 행의 합
		int row = 0;	// 마지막 열의 합
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				num =  rd.nextInt(10) + 1;
				if(i < array.length-1 && j < array[i].length-1) {
					array[i][j] = num;
					column += num;
				}else if(i < array.length-1 && j == array.length-1) {
					array[i][j] = column;
				}else if(i == array.length-1) {
					for(int k = 0; k < array.length-1; k++) {
						row += array[k][j];
					}
					array[i][j] = row;
				}
				row = 0;
			}
			column = 0;
//			array[i][3] = column;
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d\t",array[i][j]);
			}
			System.out.println();
		}
	}
	public void practice5() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1 ~ 10 사이 숫자가 아니면 "반드시 1 ~ 10 사이의 정수를 입력해야 합니다."
		// 출력후 다시 정수를 받게 하세요. 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한뒤 출력하세요.
		// (char 형은 숫자를 더해서 문자를 표현 할 수 있고 65 는 A를 나타냄)
		System.out.println("===== 사용자에게 입력 받은 이차원 배열의 크기 안에는 알파벳 대문자 랜덤 출력 =====");
		int[][] array = null;
		Random rd = new Random();
		int column = 0;
		int row = 0;
		
		do {
			System.out.print("행 크기 : ");
			column = sc.nextInt();
			System.out.print("열 크기 : ");
			row =  sc.nextInt();
			if(column > 10 || row >10) {
				System.out.println("1 ~ 10 사이의 정수를 입력 하세요.");
				continue;
			}else {
				array = new int[column][row];
			}
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					array[i][j] = (char)(65 + (int)(rd.nextInt(26) * 1));
				}
			}
			
		}while(row > 10 || column > 10);
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%2c\t",array[i][j]);
			}
			System.out.println();
		}
	}
}
