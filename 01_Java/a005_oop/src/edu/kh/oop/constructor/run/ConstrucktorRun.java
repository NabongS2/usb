package edu.kh.oop.constructor.run;

import edu.kh.oop.constructor.dto.Member;

public class ConstrucktorRun {
	public static void main(String[] args) {
		
		// 회원 생성
		
		
		// 멤버를 참조하는 mem1 = 멤버를 생성하는 기능 생성자
		 Member mem1 = new Member("user02","pass02","김삼순", 19); // 기본 생성자를 이용해서 Member 객체 생성
		 
		 Member mem3= new Member("user9999");
		 
		
		// 매개변수 생성자를 이용해서 Member 객체 생성
		Member mem2 = new Member();
		
		System.out.println(Member.programName);
		
		System.out.println("---------");
		
	}
}
