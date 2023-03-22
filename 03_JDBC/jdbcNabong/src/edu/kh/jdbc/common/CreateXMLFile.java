package edu.kh.jdbc.common;

import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Scanner;

public class CreateXMLFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Properties prop = new Properties();
		
		System.out.print("생성 할 파일 이름 : ");
		String fileName = sc.nextLine();
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName+".xml");
			
			prop.storeToXML(fos, fileName+".xml 파일입니다.");
			
			System.out.println(fileName+".xml 파일 생성 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
