package edu.kr.control.condition.pratice;

import java.util.Scanner;

// 실습문제 작성 클래스
public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("양수만 입력해주세요");
		} else {
			if(num%2==0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kScore=sc.nextInt();
		System.out.print("수학점수 : ");
		int mScore=sc.nextInt();
		System.out.print("영어점수 : ");
		int eScore=sc.nextInt();
		
		int sum= kScore + mScore + eScore;
		double avg= sum/3.0;
		

		if(kScore>=40 && mScore>=40 && eScore>=40 && avg>=60) {
			System.out.printf("평균 : %.1f \n축하합니다, 합격입니다!");
		} else {
			System.out.printf("평균 : %.1f \n불합격입니다.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
	}
}
