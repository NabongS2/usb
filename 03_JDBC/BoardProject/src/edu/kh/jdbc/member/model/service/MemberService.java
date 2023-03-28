package edu.kh.jdbc.member.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;
import java.util.Random;

import edu.kh.jdbc.member.model.dao.MemberDAO;
import edu.kh.jdbc.member.model.dto.Member;

public class MemberService {
	
	private MemberDAO dao = new MemberDAO();

	/** 회원 목록 조회 서비스
	 * @return
	 * @throws Exception
	 */
	public List<Member> selectMemberList() throws Exception{
		Connection conn = getConnection();
		
		List<Member> memberList = dao.selectMemberList(conn);
		
		close(conn);
		
		return memberList;
		
		/* 
		 	try(Connection conn = getConnection()) {
		 	return memberList = dao.selectMemberList(conn); }
		 */
	}

	/** 회원 정보 수정 서비스
	 * @param memberName
	 * @param memberGender
	 * @param memberNO
	 * @return result
	 * @throws Exception
	 */
	public int updateMember(String memberName, 
			String memberGender, int memberNO) throws Exception {
		
		Connection conn = getConnection();

		// dao 호출 후 결과 반환 받기
		int result = dao.updateMember(conn,memberName,memberGender,memberNO);
		
		// 트랜잭션 처리
		if(result>0) commit(conn);
		else		 rollback(conn);

		close(conn);
		
		return result;
	}

	/** 비밀번호 변경
	 * @param pass
	 * @param newPass
	 * @param memberNO
	 * @return result
	 * @throws Exception
	 */
	public int updatePassword(String pass, String newPass, int memberNO) throws Exception {
		
		Connection conn = getConnection();
				
		int result = dao.updatePassword(conn, pass, newPass, memberNO);
		
		if(result>0) commit(conn);
		else		 rollback(conn);
				
		close(conn);
		
		return result;
	}
	
	/** 숫자 6자리 보안 코드 생성 서비스
	 * @return code
	 */
	public String createSecurityCode() {
		
		StringBuffer code = new StringBuffer();
		
		// String : 불변성
		// StringBuffer : 가변성
		
		Random ran = new Random(); // 난수 생성 객체
		
		for(int i = 0; i<6; i++) {
			int x = ran.nextInt(10); // 0 이상 10미만 정수
			code.append(x); // StringBuffer 마지막에 추가(뒤에 이어 붙임)
		}
		
		return code.toString();
	}

	/** 회원 탈퇴 서비스
	 * @param memberPw
	 * @param memberNO
	 * @return
	 * @throws Exception
	 */
	public int unRegisterMember(String memberPw, int memberNO) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.unRegisterMember(conn,memberPw, memberNO);
		
		if(result>0) commit(conn);
		else		 rollback(conn);
		
		close(conn);
		
		return result;
	}
	
}
