package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	private Scanner sc = new Scanner(System.in);
	
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
		boolean flag=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==search) {
				index=i;
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		} else {
			System.out.println("인덱스 : "+index);
		}
		
	}
	
	
	public void ex5() {
		System.out.print("문자열 : ");
		String word=sc.next();
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);
		
		char[] arr= new char[word.length()];
		
		int num=0;
		String index="";
		for(int i=0; i<word.length(); i++) {
			arr[i] = word.charAt(i);
			
			if(word.charAt(i)==search) {
				index+=i+" ";
				num++;
			}
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %s",word,search,index);
		System.out.print("\n"+search+ " 개수 : "+num);
		
	}

	public void ex6() {
		System.out.print("정수 : ");
		int arrNum=sc.nextInt();
		
		int[] arr = new int[arrNum];
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
			
			sum+=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n총 합 : "+sum);
		
	}
	
	public void ex7() {
		System.out.print("주민등록번호(-포함) : ");
		String pNo = sc.next();
		
		char[] arr=new char[14];
		
		for(int i=0; i<arr.length; i++) {
			if(i<8) {
				arr[i]=pNo.charAt(i);
				System.out.print(arr[i]);
			} else {
				System.out.print("*");
			}
		}
		
		
	}
	
	public void ex8() {
		System.out.print("정수 : ");
		int num=sc.nextInt();
		
		int[] arr = new int[num];
		if(num<3 && num%3==0) {
			System.out.println("다시 입력하세요.");
		} else {
			
			int numInput=0;
			for(int i=0; i<arr.length; i++) {
				if(i<=num/2) {
					numInput++;
					arr[i]=numInput;
				} else {
					numInput--;
					arr[i]=numInput;
				}
				
				if(i==arr.length-1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i]+", ");
				}
				
			}
		}
		
	}
	
	public void ex9() {
		int[] arr=new int[10];

		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*arr.length+1);
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void ex10() {
		int[] arr=new int[10];

		System.out.print("발생한 난수 : ");
		
		int max= 0;			
		int min= 11;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*arr.length+1);
			System.out.print(arr[i]+" ");
			
			if(min>arr[i]) {
				min = arr[i];
			}
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	}
	
	public void ex11() {
//		int[] arr=new int[10];
//
//		System.out.print("발생한 난수 : ");
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			if()
//			arr[i]=(int)(Math.random()*arr.length+1);
//			System.out.print(arr[i]+" ");
//		}
		
		
		
	}
	
	public void ex12() {
		
//		int[] arr= new int[6];
//		
//		for(int i=0; i<arr.length; i++) {
//			int random =(int)(Math.random()*45+1);
//			
//			for(int x=0; x<arr.length; x++) {
//				
//			}
//		}
		
		
		
	}
	
	public void ex13() {
//		System.out.print("문자열 : ");
//		String word=sc.next();
//		
//		char[] arr= new char[word.length()];
//		
//		for(int i=0; i<word.length(); i++) {
//			arr[i] = word.charAt(i);
//			
//			if()
//			
//		}
	}
	
	public void ex14() {
		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		int num=sc.nextInt();
		
//		String[] arr1= new String[num];
//		String[] arr2= new String[plus];
//		
//		int plus=num;
//		for(int i=0; i<arr1.length; i++) {
//			System.out.printf("$d번째 문자열 : ",i+1);
//			arr1[i]=sc.next();
//		}
//		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
//		String continue=sc.next().charAt(0);
//		
//		if(continue.charAt(0)=='y') {
//			System.out.print("배열의 크기를 입력하세요 : ");
//			arr1[i]=sc.next();
//		}
	}
	
	public void ex15() {
		
//		int[][] arr= new int[3][3];
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int x=0; x<arr[0].length; x++) {
//				
//				
//			}
//			System.out.println();
//		}
		
	}
	
	public void ex16() {
		
		int[][] arr=new int[4][4];
		
		int num=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[0].length; x++) {
				arr [i][x]=num;
				num++;
				System.out.printf("%3d",num);
			}
			System.out.println();
		}
		
	}
	
	public void ex17() {
		int[][] arr=new int[4][4];
		
		int num=17;
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[0].length; x++) {
				arr [i][x]=num;
				num--;
				System.out.printf("%3d",num);
			}
			System.out.println();
		}
		
	}
	
	public void ex18() {
		
//		int[][] arr= new int[4][4];
//		
//		
//		for(int i=0; i<arr.length; i++) {
//			if(i<arr.length-1) {
//				for(int x=0; x<arr.length-1; x++) {
//					arr[i][x]=(int)(Math.random()*10+1);
//				}
//			}
//			
//		}
		
		
	}
	
	public void ex19() {
		
//		System.out.print("행 크기 : ");
//		int row =sc.nextInt();
//		
//		System.out.print("열 크기 : ");
//		int col =sc.nextInt();
//		
//		boolean tf=false;
//		if(row<1 || row>10 || col<1 || col>10) {
//			tf=false;
//		} else {
//			tf=true;
//		}
//		
//		while(!tf){
//			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
//		}
		
		
	}
		
	public void ex20() {
		
		System.out.print("행의 크기 : ");
		int row=sc.nextInt();
		
		char[][] arr= new char[row][];
		
		char ch='a';
		for(int i=0; i<arr.length; i++) {
			System.out.print("열의 크기 : ");
			arr[i]= new char[sc.nextInt()];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[i].length; x++) {
				arr[i][x]=ch;
				ch++;
				System.out.print(arr[i][x]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void ex21() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1= new String[3][2];
		String[][] arr2= new String[3][2];
		
		int index=-1;
		System.out.println("== 1분단 ==");
		for(int row1=0; row1<arr1.length; row1++) {
			for(int col1=0; col1<arr1[0].length; col1++) {
				index++;
				arr1[row1][col1]=students[index];
				System.out.print(arr1[row1][col1]+" ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int row2=0; row2<arr1.length; row2++) {
			for(int col2=0; col2<arr1[0].length; col2++) {
				index++;
				arr2[row2][col2]=students[index];
				System.out.print(arr2[row2][col2]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void ex22() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1= new String[3][2];
		String[][] arr2= new String[3][2];
		
		int index=-1;
		System.out.println("== 1분단 ==");
		for(int row1=0; row1<arr1.length; row1++) {
			for(int col1=0; col1<arr1[0].length; col1++) {
				index++;
				arr1[row1][col1]=students[index];
				System.out.print(arr1[row1][col1]+" ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int row2=0; row2<arr1.length; row2++) {
			for(int col2=0; col2<arr1[0].length; col2++) {
				index++;
				arr2[row2][col2]=students[index];
				System.out.print(arr2[row2][col2]+" ");
			}
			System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String search= sc.next();
		
		int index1=-1;
		int index2=-1;
		
		
		for(int row1=0; row1<arr1.length; row1++) {
			for(int col1=0; col1<arr1[0].length; col1++) {
				
				if(arr1[row1][col1].equals(search)) {
					index1=row1;
					index2=col1;
				}
			}
		}
		
		for(int row2=0; row2<arr2.length; row2++) {
			for(int col2=0; col2<arr2[0].length; col2++) {
				
				if(arr2[row2][col2].equals(search)) {
					index1=row2;
					index2=col2;
				}
			}
		}
		
		
		if(index2==-1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
		} else if(index2==1) {
			System.out.printf("검색하신 %s 학생은 %d분단 %번째 줄 오른쪽에 있습니다.",search,index1,index2);
		} else {
			System.out.printf("검색하신 %s 학생은 %d분단 %번째 줄 왼쪽에 있습니다.",search,index1,index2);
		}
		

		
	}
	
	public void ex23() {
		
		
	}
	public void ex24() {
		
		
	}
}
