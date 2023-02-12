package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPractice {
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num= sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		
	}
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num= sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num= sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
			System.out.print(i+" ");
			if(i != num) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
		
	}
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1){
			if(num2>num1){
				for(int i=num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
			} else if(num2<num1){
				for(int i=num2; i<=num1; i++) {
					System.out.print(i+" ");
				}
			} else {
				System.out.println(num1);
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>=2 && num<=9) {
			for(int x=num; x<=9; x++) {
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d\n", x, i, x*i);
				}
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int x=num; x>=i+1; x--) {
				System.out.print(" ");
			}
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1; i>=1; i--) {
			for(int x=i; x>=1; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int x=num; x>=i+1; x--) {
				System.out.print(" ");
			}
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			for(int z=2; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public void ex12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(i==1) {
				for(int x=1; x<=num; x++) {
					System.out.print("*");
				}
				System.out.println();
			} else if(i>1 && i<num) {
				System.out.print("*");
				for(int z=3; z<=num; z++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			} else if(i==num) {
				for(int x=1; x<=num; x++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			
		}
		
		
		
	}
	public void ex13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 :  ");
		int num = sc.nextInt();
		
		int count=0;
		for(int i=1; i<=num; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			} 
		}
		for(int i=1; i<=num; i++) {
			if(i%2==0 && i%3==0){
				count++;
			}
		}
		System.out.println("\ncount : "+count);

		
		
	}
}
