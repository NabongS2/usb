package edu.kh.jdbc.member.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.jdbc.member.model.dto.Member;

public class MemberDAO {
	
	// JDCB 객체 참조 변수
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// xml에 작성된 SQL을 읽어와 저장할 객체 참조 변수
	private Properties prop;
	
	public MemberDAO() { // 기본 생성자로 객체 생성 시 XML 읽어오기
		try {
			prop = new Properties();
			
			prop.loadFromXML(new FileInputStream("member-sql.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 회원 목록 조회 SQL 수행
	 * @param conn
	 * @return memberList
	 * @throws Exception
	 */
	public List<Member> selectMemberList(Connection conn) throws Exception {
		
		// 결과 저장용 변수 선언 / 객체 생성 
		List<Member> memberList = new ArrayList<>();
		
		try {
			String sql = prop.getProperty("selectMemberList");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String memberId = rs.getString(1);
				String memberName = rs.getString(2);
				String memberGender = rs.getString(3);
				
				Member mem = new Member();
				mem.setMemberId(memberId);
				mem.setMemberName(memberName);
				mem.setMemberGender(memberGender);
				
				memberList.add(mem);
			}
			
			
		} finally {
			close(rs);
			close(stmt);
		}
		
		return memberList;
	}

	/** 회원 정보 변경 SQL 수행
	 * @param conn
	 * @param memberName
	 * @param memberGender
	 * @param memberNO
	 * @return result
	 * @throws Exception
	 */
	public int updateMember(Connection conn, String memberName, String memberGender, int memberNO) throws Exception {
		
		int result;
		
		try {
			
			String sql = prop.getProperty("updateMember");
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, memberName);
			pstmt.setString(2, memberGender);
			pstmt.setInt(3, memberNO);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 비밀번호 변경 SQL 수행
	 * @param conn
	 * @param pass
	 * @param newPass
	 * @param memberNO
	 * @return result
	 * @throws Exception
	 */
	public int updatePassword(Connection conn, String pass, String newPass, int memberNO) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("updatePassword");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,newPass);
			pstmt.setInt(2,memberNO);
			pstmt.setString(3,pass);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/**
	 * @param conn
	 * @param memberPw
	 * @param memberNO
	 * @return
	 * @throws Exception
	 */
	public int unRegisterMember(Connection conn, String memberPw, int memberNO) throws Exception {
		
		int result=0;
		
		try {
			String sql = prop.getProperty("unRegisterMember");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNO);
			pstmt.setString(2, memberPw);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
}

