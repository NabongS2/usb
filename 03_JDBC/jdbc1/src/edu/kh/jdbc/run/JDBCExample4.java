package edu.kh.jdbc.run;

import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.dao.SelectJobNameDAO;
import edu.kh.jdbc.dto.Employee2;

public class JDBCExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*직급명을 입력 받아 일치하는 사원의
		부서명, 직급명, 이름, 이메일을  이름 오름 차순으로 조회
	 	*/
		
		System.out.print("직급명 입력 : ");
		String input = sc.nextLine();
		
		// DAO 생성 후 호출
		SelectJobNameDAO dao = new SelectJobNameDAO();
		
		List<Employee2> empList = dao.select(input);
		
		if(empList.isEmpty()) { // empList가 비어있으면 true
			// == empList.size() == 0
		System.out.println("일치하는 부서가 없습니다.");
		return;
		}
		
		
		// 향상된 for 문
		for(Employee2 emp : empList) {
		System.out.printf("부서명: %s / 직급: %s / 이름: %s / 이메일 %s \n",
		emp.getDeptName(), 
		emp.getJobName(), 
		emp.getName(), 
		emp.getEmail());
		}
		
		
		dao.select(input);
	}

}
