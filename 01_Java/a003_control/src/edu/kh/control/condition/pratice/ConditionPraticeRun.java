package edu.kh.control.condition.pratice;

import java.util.Scanner;

// 실행용 클래스
public class ConditionPraticeRun {
	public static void main(String[] args) {
		
		ConditionPractice cp = new ConditionPractice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실행 할 예제 번호 입력 : ");
		int num= sc.nextInt();
				
		switch(num) {
		case 1 : cp.practice1(); break;
		case 2 : cp.practice2(); break;
		case 3 : cp.practice3(); break;
		case 4 : cp.practice4(); break;
		case 5 : cp.practice5(); break;
		default: System.out.println("존재하지 않는 예제입니다.");
		}
		
	}
	
}
