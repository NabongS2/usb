package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPracticeRun {
	public static void main(String[] args) {
		ForPractice fp = new ForPractice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실행할 예제 번호 : ");
		int num=sc.nextInt();
		
		switch(num){
		case 1 : fp.ex1(); break;
		case 2 : fp.ex2(); break;
		case 3 : fp.ex3(); break;
		case 4 : fp.ex4(); break;
		case 5 : fp.ex5(); break;
		case 6 : fp.ex6(); break;
		case 7 : fp.ex7(); break;
		case 8 : fp.ex8(); break;
		case 9 : fp.ex9(); break;
		case 10 : fp.ex10(); break;
		case 11 : fp.ex11(); break;
		case 12 : fp.ex12(); break;
		case 13 : fp.ex13(); break;
		default : System.out.println("없는 예제 번호입니다.");
		}
		
	}
}
