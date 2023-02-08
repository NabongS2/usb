package edu.kh.variable;

public class Practice {
	public static void main(String[] args) {
		
		/* 기본 자료형 8가지
		 * 
		 * 정수
		 * byte(1), short(2), int(4)(기본형), long(8, L/l)
		 * 
		 * 실수
		 * float(4, F/f), double(8)(기본형)
		 * 
		 * 문자형
		 * char(2)
		 * 
		 * 논리형
		 * boolean(1, true/false)
		 * 
		 * [컴퓨터 값 처리 원칙]
		 * 같은 자료형 끼리만 연산 가능, 결과도 같은 자료형
		 * 
		 * [자동 형변환]
		 * 값의 범위가 다른 자료형끼리 연산 시
		 * 범위가 작은 자료형을 큰 자료형으로 변환
		 * (컴파일러가 자동으로 진행)
		 * 
		 * [강제 형변환]
		 * 특정한 자료형으로 강제 변환(바꾸고 싶은 자료형을 명시)
		 * 데이터 손실이 발생할 수 있다.
		 * 
		 * */
		
		
		int iNum1= 10;
		int iNum2= 4;
		float fNum= 3.0f;
		double dNum= 2.5;
		char ch='A';
		
		// println() 자동 완성 : syso -> ctrl + spacebar -> enter
		System.out.println(iNum1 / iNum2); // 2 -> 10 / 4 = 2.5 더블이니까 인트로 형변환
		System.out.println((int)dNum); // 2 -> 2.5 더블을 인트로 강제 형변환
		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		System.out.println((double)iNum1/iNum2); //인트 계산을 더블로 바꾸고 싶으면 앞이나 뒤나 둘 중에 하나나 둘 다 더블로 바꿔주면 됨
		System.out.println((int)fNum);
		System.out.println((int)(iNum1/fNum));
		
		System.out.println(iNum1/fNum); // 3.3333333 float
		System.out.println((double)iNum1/fNum); // 3.3333333333333335 double이 더 정확하다.
		
		System.out.println((int)ch); //65
		System.out.println(iNum1+ch); //75 int+char(->int) = 10+65=75 작은 char가 인트로 바뀐다.
		
		System.out.println((char)(iNum1+ch)); //K abcdefghijk 10칸 가야함
		
		
		// 개인공부
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}
}
