package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 논리 연산자 : &&, ||
		
		// &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
		// ~와, 그리고(이고), 이면서(면서), 부터, 까지, 사이
		
		// 입력 받은 정수가 100 이상이면서 짝수인가?
		
		// System.out.println("num1을 입력하시오 : ");
		// int num1 = sc.nextInt();
		int num1 = 98;
		boolean result1 = num1 >= 100 && num1 % 2 == 0;
		System.out.println("100 이상이면서 짝수? " + result1);
		
		// 입력 받은 정수가 50 이하이고 3의 배수인가?
		
		int num2= 42;
		boolean result2 = num2 <=50 && num2 %3 ==0;
		System.out.println("50 이하이고 3의 배수? " + result2);
		
		// 입력 받은 정수가 1부터 100사이의 숫자인가?
		int num3 = 56;
		boolean result3 = num3>=1 && num3<=100;
		System.out.println("1부터 100사이의 숫자? "+result3);
		
		
		// ||(OR) 연산자 : 둘 다 false이면 false, 나머진 true
		// 또는, ~이거나(거나)
		
		// 정수가 10을 초과하거나 홀수 인가?
		
		int num4 = 20;
		boolean result4 = num4>10 || num4 % 2 == 1;
		System.out.println("10을 초과하거나 홀수 인가? " + result4);
		
		// 정수는 0부터 50 사이 숫자 또는 음수 인가?
		int num5 = 53;
		boolean result5 = num5>=0 && num5<=50 || num5<0;
		// && 가 우선 순위가 높다. ( ) 괄호 안써도 어차피 최우선
		
		// boolean result5 = num5<=50;
		System.out.println("0부터 50 사이 숫자 또는 음수 "+result5);
		
		// 논리 부정 연산자 : ! (NOT)
		// - 논리 값을 반대로 바꾸는 연산자
		
		// 11은 짝수가 아니다.
		System.out.println("11은 짝수가 아니다 : "+ !(11%2==0));
		
		System.out.println(!!true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
