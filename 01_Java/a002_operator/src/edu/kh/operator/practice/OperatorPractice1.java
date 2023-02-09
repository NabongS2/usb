package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요. */
		
		System.out.print("인원 수 : "); // 29
		int personNum = sc.nextInt();
		System.out.print("사탕 수 : "); // 100
		int candy = sc.nextInt();
		
		
		int PPC = candy / personNum; // 100/29
		int LCandy = candy % personNum;
		
		System.out.println("\n1인당 사탕 개수 : "+PPC);
		System.out.println("남는 사탕 개수 : "+ LCandy);
		
		// System.out.printf("인원 당 가진 캔디는 %d개이고, 남은 캔디는 %d개 입니다.",PPC ,LCandy);
		
		
	}
}
