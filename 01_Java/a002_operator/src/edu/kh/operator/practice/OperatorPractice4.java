package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		   세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		   세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		 */
		
		System.out.print("국어 : ");
		int lScore = sc.nextInt();
		
		System.out.print("영어 : ");
		int eScore = sc.nextInt();
		
		System.out.print("수학 : ");
		int mScore = sc.nextInt();
		
		int scoreSum = lScore + eScore + mScore; // 합계
		double scoreAverge = scoreSum /3.0; // 평균
		// (합계가 int이기 때문에 나누는 값을 double로 주면 값도 double)
		// double = int / int 자료형이 다르면 소수점 자리가 다 버려짐
		
		String result = scoreAverge>=60 &&
				lScore>=40 && eScore>=40 && mScore>=40 ? "합격" : "불합격";
		
		System.out.println("\n합계 : "+ scoreSum);
		System.out.println("평균 : "+ scoreAverge);
		System.out.println(result);
		
		
		
	}
}
