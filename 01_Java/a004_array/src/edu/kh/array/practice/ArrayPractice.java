package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Random;
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
		
		
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*arr.length+1);
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void ex12() {
		
		int[] arr= new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*45+1);
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void ex13() {
		
		System.out.print("문자열 : ");
		String word=sc.next();
		
//		char[] arr= new char[word.length()];
//		char[] newArr;
//		
//		int count=0;
//		System.out.print("문자열에 있는 문자 : ");
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=word.charAt(i);
//			
//			for(int x=0; x<i; x++) {
//				if(arr[i]==arr[x]) {
//					count++;
//					newArr = new char[arr.length-count];
//				} else {
//					newArr[i]=arr[i];
//					if(i==newArr.length) {
//						System.out.print(newArr[i]+" ");
//					} else {
//						System.out.print(newArr[i]+", ");
//						System.out.println("문자 개수 : "+newArr.length);
//				}
//			}
//			
//		}
//		
//	}
		
		
	}
	
	public void ex14() {
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt(); // 입력 버퍼에 개행문자(엔터)가 남음
		
		sc.nextLine(); // 입력버퍼에 남은 개행문자(엔터) 제거
		
		// 2. 첫 배열 생성
		String[] books = new String[size];
		
		// 3. 첫 배열에 저장할 문자열 입력 받기
		for(int i=0; i<books.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			books[i] = sc.nextLine(); // 입력 버퍼에서 다음 엔터까지 읽어옴
		}
		
		// 4. n이 입력될 때 까지 무한 반복 -> n 입력 시 break
		while(true) {

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch=='N') {
				break;
			}
			
			// 5. 더 입력 받을 개수 입력
			System.out.print("더 입력 하고 싶은 개수 : ");
			int addSize = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			
			// 6. 기존 배열 보다 늘어난 개수만큼 큰 새 배열
			String newBooks[] = new String[books.length+addSize];
			
			// 7. 깊은 복사를 통해 기존 배열 내용을 새 배열로 복사
			System.arraycopy(books, 0, newBooks, 0, books.length);
			
			// 8. 새 배열의 빈칸 부터 새로운 입력을 받아서 저장
			for(int i=books.length; i<newBooks.length; i++) {
				System.out.print((i+1)+"번째 문자열 : ");
				newBooks[i]=sc.nextLine();
			}
			
			// 9. 기존 참조 배열 books에 newBooks의 주소를 얕은 복사
			books = newBooks;
		} // while 종료
		
		// 10.  배열에 저장된 모든 값 출력
		System.out.println(Arrays.toString(books));
		
	}
	
	public void ex15() {
		
		String[][] arr= new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[0].length; x++) {
				arr[i][x]=String.format("(%d, %d)",i,x);
				System.out.print(arr[i][x]);
			}
			System.out.println();
		}
		
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
		
		// 1. 4행 4열 2차원 배열 생성
		int[][] arr= new int[4][4];

		final int LAST_ROW_INDEX = arr.length -1; // 행 마지막 인덱스
		final int LAST_COL_INDEX = arr[0].length -1; // 열 마지막 인덱스
		
		Random random = new Random();
		
		for(int row=0; row<LAST_ROW_INDEX; row++) {
				for(int col=0; col<LAST_COL_INDEX; col++) {
					arr[row][col]=random.nextInt(10)+1;
					
					// 3행 3열에 발생된 난수 모두 누적
					arr[LAST_ROW_INDEX][LAST_COL_INDEX]+=arr[row][col];
					
					// 난수 대입과 동시에 해당 행/열의 끝에 누적
					arr[row][LAST_COL_INDEX]+=arr[row][col]; // 각 행 마지막 열에 누적
					arr[LAST_ROW_INDEX][col]+=arr[row][col]; // 각 행 마지막 열에 누적
				}
		}
		
		// 출력용 2중 for문
		for(int row=0; row<=LAST_ROW_INDEX; row++) {
			for(int col=0; col<=LAST_COL_INDEX; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
		
		
		
	}
	
	public void ex19() {
		
		Random random = new Random();
		
		while(true){
			System.out.print("행 크기 : ");
			int row =sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col =sc.nextInt();
			
			if(row<1 || row>10 || col<1 || col>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else {
				char[][] arr=new char[row][col];
				
				char ch='A';
				for(int i=0; i<arr.length; i++) {
					for(int x=0; x<arr[0].length; x++) {
						arr[i][x]=(char)(random.nextInt(26)+65);
						System.out.print(arr[i][x]+" ");
					}
					System.out.println();
				}
				break;
			}
		
		}
		
		
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
		for(int row2=0; row2<arr2.length; row2++) {
			for(int col2=0; col2<arr2[0].length; col2++) {
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
		for(int row2=0; row2<arr2.length; row2++) {
			for(int col2=0; col2<arr2[0].length; col2++) {
				index++;
				arr2[row2][col2]=students[index];
				System.out.print(arr2[row2][col2]+" ");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String search= sc.next();
		
		int arrNum=-1;
		int rowIndex=-1;
		String colIndex="";
		
		for(int i=0; i<arr1.length; i++) {
			for(int x=0; x<arr1[0].length; x++) {
				
				if(arr1[i][x].equals(search)) {
					arrNum=1;
					rowIndex=i;
					colIndex=x==0?"왼":"오른";
					break;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int x=0; x<arr2[0].length; x++) {
				
				if(arr2[i][x].equals(search)) {
					arrNum=2;
					rowIndex=i;
					colIndex=x==0?"왼":"오른";
					break;
				}
			}
		}
		
		if(rowIndex==-1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
		} else {
			System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s쪽에 있습니다.",search,arrNum,rowIndex+1,colIndex);
		}	
		

		
	}
	
	public void ex23() {
		// 못품!!
		String[][] arr=new String[6][6];

		
		
		
	}
	public void ex24() {
		// 못품!!
		
	}
}
