package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	public void ex1() {
		
		int[] arr = new int[9];
		
		int num=0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			num++;
			arr[i]=num;
			if(i%2==0) {
				sum+=arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println("\n짝수 번째 인덱스 합: "+sum);
		
		
	}
	
	public void ex2() {

		int[] arr = new int[9];
		
		int num=10;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			num--;
			arr[i]=num;
			if(i%2==1) {
				sum+=arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println("\n홀수 번째 인덱스 합: "+sum);
		
		
	}
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num=sc.nextInt();
		
		int[] arr= new int[num];

		int start = 0;
		for(int i=0; i<arr.length; i++) {
			start++;
			arr[i]=start;
			System.out.print(arr[i]+" ");
		}
		
	}
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 0 : ");
		int num1=sc.nextInt();
		System.out.print("입력 1 : ");
		int num2=sc.nextInt();
		System.out.print("입력 2 : ");
		int num3=sc.nextInt();
		System.out.print("입력 3 : ");
		int num4=sc.nextInt();
		System.out.print("입력 4 : ");
		int num5=sc.nextInt();
		
		int[] arr = {num1, num2, num3, num4, num5};
		
		System.out.print("검색할 값 : ");
		int search=sc.nextInt();
		
		int index=0;
		boolean flag=true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==search) {
				index=i;
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		} else {
			System.out.println("인덱스 : "+index);
		}
		
	}
	
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word=sc.next();
		System.out.print("문자 : ");
		String letter = sc.next();
		
		char[] arr= new char[word.length()];
		
		int resultNum=0;
		for(int i=0; i<word.length(); i++) {
			arr[i] = word.charAt(i);
			
			if(letter==arr[i]) {
				
				resultNum++;
			}
			
		}
		
		
		
	}
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex9() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex12() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex13() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex14() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex15() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex16() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex17() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex18() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex19() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex20() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex21() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex22() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex23() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	public void ex24() {
		Scanner sc = new Scanner(System.in);
		
		
	}
}
