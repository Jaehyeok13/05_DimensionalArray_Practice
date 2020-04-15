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
	
	public void practice6() {
		// 초기화되어 잇는 배열을 가지고 아래의 '그림' 실습문제 4 흐름 과' 같은 방식으로 출력하세요.
		// 단, print() 를 사용하고 값 사이에 띄어쓰기 (" ") 가 존재하도록 출력하세요.
		System.out.println("===== 배열 흐름도 변경 식 =====");
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0;  j < strArr[i].length; j++) {
				System.out.printf("%2s", strArr[j][i]);
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		// 사용자에게 행의 크기를 입력 받고 그 수만크므이 반복을 통해 열의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요.
		// 그리고 각 인덱스에 'a' 부터 총 인덱스의 개수만큼 하나씩 늘려저장하고 출력하세요.
		System.out.println("===== 행의 크기 입력 받은후 입력받은 크기의 열 크기 입력 받기 =====");
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		char[][] chArray = new char[row][];
		
		for(int i = 0; i < chArray.length; i++) {
			System.out.printf("%d 열의 크기 : ", i);
			chArray[i] = new char[sc.nextInt()];
		}
		char data = 'a';
		for(int i = 0; i < chArray.length; i++ ) {
			for(int j = 0; j < chArray[i].length; j++) {
				chArray[i][j] = data++;
			}
		}
		
		for(int i = 0; i < chArray.length; i++ ) {
			for(int j = 0; j < chArray[i].length; j++) {
				System.out.printf("%c\t",chArray[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		// 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고 
		// 2열 3행으로 2차원 배열 2개를 이요하여 분단으로 나눠
		// 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		System.out.println("===== 1차원 배열 값 2차원으로 분단 나누기 =====");
		String[] origin = new String[] {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] divide1 = new String[3][2];
		String[][] divide2 = new String[3][2];
		int count = 0;
		
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				divide1[i][j] = origin[count++];
			}
		}
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				divide2[i][j] = origin[count++];
			}
		}
		System.out.println("  == 1분단 ==");
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				System.out.printf("%2s\t",divide1[i][j]);
			}
			System.out.println();
		}
		System.out.println("  == 2분단 ==");
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				System.out.printf("%2s\t",divide2[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		// 8번 문제 자리 배치한 것을 가지고 학생 이름을 검색하여 해당 학생이 어느 자리에 앉았는지 출력하세요.
		String[] origin = new String[] {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] divide1 = new String[3][2];
		String[][] divide2 = new String[3][2];
		int count = 0;
		
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				divide1[i][j] = origin[count++];
			}
		}
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				divide2[i][j] = origin[count++];
			}
		}
		System.out.println("  == 1분단 ==");
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				System.out.printf("%2s\t",divide1[i][j]);
			}
			System.out.println();
		}
		System.out.println("  == 2분단 ==");
		for(int i = 0; i < divide1.length; i++) {
			for(int j = 0; j <divide1[i].length; j++) {
				System.out.printf("%2s\t",divide2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===== 검색한 이름 위치 찾기 =====");
		System.out.print("검색할 학생 이름을 입력 하세요 : ");
		String findName = sc.next();	
		int line = 0;
		int number = 0;
		String local = "";
		
		for(int i = 0; i < origin.length; i++) {
			if(origin[i].contains(findName)) {
				number = i / 2;
				if(i < 5) {
					// 5보다 작으면 1분
					line = 1;
					number += 1;
				}else {
					// 5보다 크면 2분단
					line = 2;
					number -= 2;
				}
				if(i % 2 == 0) {
					// 홀수면 왼쪽
					local = "왼쪽";
				}else {
					// 짝수 오른쪽
					local = "오른쪽";
				}
			}
		}
		System.out.printf("검색하신 %s 학생은 %d분단 %d 번째 줄 %s에 있습니다.",findName,line,number,local);
	}
	
	public void practice10() {
		// String 2차원 배열 6행 6열을 만들고 해으이 맨 위와 열의 맨 앞은 각 인덱스를 저장하세요.
		// 그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		System.out.println("===== 6행 6열의 입력 받은 행과 열 에 X 표시하기 =====");
		String[][] array = new String[6][6];
		System.out.print("행 인덱스 입력 : ");
		int column = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int row = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 && j != 0) {
					array[i][j] = j - 1 + "";
				} else if (j == 0 && i != 0) {
					array[i][j] = i - 1 + "";
				} else {
					array[i][j] = "";
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if (column == i && row == j) {
					array[i+1][j+1] = "X";
				}
				System.out.printf("%2s",array[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		// 10번과 내용이 같으나 행 입력 시 99 가 입력되지 않으면 무한 반복이 되도록 구현하세요.
		System.out.println("===== 행이 99가 입력 되면 종료 하게 한다. =====");
		String[][] array = new String[6][6];
		int column = 0;
		int row = 0;
		
		do {
			System.out.print("행 인덱스 입력 : ");
			column = sc.nextInt();
			if(column == 99) {
				break;
			}
			System.out.print(" 인덱스 입력 : ");
			row = sc.nextInt();
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (i == 0 && j != 0) {
						array[i][j] = j - 1 + "";
					} else if (j == 0 && i != 0) {
						array[i][j] = i - 1 + "";
					} else {
						array[i][j] = "";
					}
				}
			}
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					if (column == i && row == j) {
						array[i+1][j+1] = "X";
					}
					System.out.printf("%2s",array[i][j]);
				}
				System.out.println();
			}
		}while(column != 99);
		System.out.println("프로그램 종료");
	}
}
