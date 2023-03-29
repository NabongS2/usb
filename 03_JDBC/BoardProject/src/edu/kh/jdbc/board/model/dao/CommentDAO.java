package edu.kh.jdbc.board.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.jdbc.board.model.dto.Comment;

public class CommentDAO {
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public CommentDAO() {
		try {
			prop  = new Properties();
			prop.loadFromXML(new FileInputStream("comment-sql.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 댓글 목록 조회 SQL 수행
	 * @param conn
	 * @param input
	 * @return commentList
	 * @throws Exception
	 */
	public List<Comment> selectCommentList(Connection conn, int input) throws Exception {
		
		// 결과 저장용 객체 생성
		List<Comment> commentList = new ArrayList<>();
		
		try {
			String sql = prop.getProperty("selectCommentList");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, input);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Comment c = new Comment();
				
				c.setCommentNo(rs.getInt(1));
				c.setCommentContent(rs.getString(2));
				c.setMemberNo(rs.getInt(3));
				c.setMemberName(rs.getString(4));
				c.setCreateDate(rs.getString(5));
				
				commentList.add(c); // 리스트에 추가
				
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return commentList;
	}

	/** 댓글 번호 부여 SQL
	 * @param conn
	 * @return commentNo
	 * @throws Exception
	 */
	public int nextCommentNO(Connection conn) throws Exception {
		
		int commentNo = 0;
		
		try {
			String sql = prop.getProperty("nextCommentNO");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			commentNo = rs.getInt(1);
			
		} finally {
			close(rs);
			close(stmt);
		}
		return commentNo;
	}

	/** 댓글 삽입 SQL
	 * @param conn
	 * @param commentNO
	 * @param cotent
	 * @param boardNo
	 * @param memberNO
	 * @return result
	 * @throws Exception
	 */
	public int insertComment(Connection conn, int commentNO, String cotent, 
							int boardNo, int memberNO) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("insertComment");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, commentNO);
			pstmt.setString(2, cotent);
			pstmt.setInt(3, memberNO);
			pstmt.setInt(4, boardNo);
			
			result = pstmt.executeUpdate();
			
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 본인 맞는지 수행 SQL
	 * @param conn
	 * @param boardNo
	 * @param commentNo
	 * @param memberNO
	 * @return
	 * @throws Exception
	 */
	public int correctComment(Connection conn, int boardNo, 
										int commentNo, int memberNO) throws Exception {
		int corr = 0;
		
		try {
			String sql = prop.getProperty("corr"); 
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			pstmt.setInt(2, commentNo);
			pstmt.setInt(3, memberNO);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				corr = rs.getInt(1);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return corr;
	}

	/** 댓글 수정 SQL
	 * @param conn
	 * @param updateComment
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public int updateComment(Connection conn, String updateComment, int commentNo) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("updateComment");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateComment);
			pstmt.setInt(2, commentNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}


	/** 댓글 삭제 SQL 실행
	 * @param conn
	 * @param commentNo
	 * @return
	 * @throws Exception
	 */
	public int deleteComment(Connection conn, int commentNo) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("deleteComment");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, commentNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}


	
	
}
