package edu.kh.control.condition.pratice;

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
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d \n합계 : %d \n평균 : %.1f", kScore, mScore, eScore, sum, avg );
			System.out.printf("\n축하합니다, 합격입니다!");
		} else {
			System.out.printf("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month=sc.nextInt();
		String result;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12: result="31일 까지 있습니다."; break;
		case 2 : result="28일 까지 있습니다."; break;
		case 4 : case 6 : case 9 : case 11 : result="30일 까지 있습니다."; break;
		default : result = "잘못 입력된 달입니다.";
		}
		
		System.out.println(month+"월은 "+result);
		
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weigth = sc.nextDouble();
		
		double bmi = weigth / (height*height);
		
		String result;
		if(bmi>=30) {
			result= "고도비만";
		} else if(bmi>=25) {
			result= "비만";
		} else if(bmi>=23 || bmi>18.5) {
			result= "정상체중";
		} else {
			result= "저체중";
		}
				
		System.out.println("BMI 지수 : "+bmi);
		System.out.println(result);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mScore= sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int lScore= sc.nextInt();
		System.out.print("과제 점수 : ");
		int hScore= sc.nextInt();
		System.out.print("출석 횟수 : ");
		int att= sc.nextInt();
		
		double mScoreR= mScore * 0.2;
		double lScoreR= lScore * 0.3;
		double hScoreR= hScore * 0.3;
		double attP= att*5;
		double attR= attP * 0.2;
		
		double result= mScoreR+lScoreR+hScoreR+attR;
				
		System.out.println("=============== 결과 =================");
		
		if(att<14) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)",att);
		} else if(result<70.0) {
			System.out.printf("중간 고사 점수(20) : %.1f",mScoreR);
			System.out.printf("\n기말 고사 점수(30) : %.1f",lScoreR);
			System.out.printf("\n과제 점수 (30) : %.1f",hScoreR);
			System.out.printf("\n출석 점수 (20) : %.1f",attR);
			System.out.printf("\n총점 : %.1f",result);
			System.out.println("\nFail [점수 미달]");
		} else {
			System.out.printf("\n중간 고사 점수(20) : %.1f",mScoreR);
			System.out.printf("\n기말 고사 점수(30) : %.1f",lScoreR);
			System.out.printf("\n과제 점수 (30) : %.1f",hScoreR);
			System.out.printf("\n출석 점수 (20) : %.1f",attR);
			System.out.printf("\n총점 : %.1f",result);
			System.out.println("\nPASS");
		}
		
		
		
	}
}
