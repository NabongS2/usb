package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPracticeRun {

	public static void main(String[] args) {
		
		ArrayPractice ap=new ArrayPractice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실행할 예제 번호 : ");
		int num= sc.nextInt();
		
		switch(num) {
		
		case 1 : ap.ex1(); break;
		case 2 : ap.ex2(); break;
		case 3 : ap.ex3(); break;
		case 4 : ap.ex4(); break;
		case 5 : ap.ex5(); break;
		case 6 : ap.ex6(); break;
		case 7 : ap.ex7(); break;
		case 8 : ap.ex8(); break;
		case 9 : ap.ex9(); break;
		case 10 : ap.ex10(); break;
		case 11 : ap.ex11(); break;
		case 12 : ap.ex12(); break;
		case 13 : ap.ex13(); break;
		case 14 : ap.ex14(); break;
		case 15 : ap.ex15(); break;
		case 16 : ap.ex16(); break;
		case 17 : ap.ex17(); break;
		case 18 : ap.ex18(); break;
		case 19 : ap.ex19(); break;
		case 20 : ap.ex20(); break;
		case 21 : ap.ex21(); break;
		case 22 : ap.ex22(); break;
		case 23 : ap.ex23(); break;
		case 24 : ap.ex24(); break;
		
		default: System.out.println("없는 예제 번호입니다.");
		}
	}
}
