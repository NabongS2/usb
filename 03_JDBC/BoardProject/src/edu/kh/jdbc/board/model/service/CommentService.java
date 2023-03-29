package edu.kh.jdbc.board.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;

import edu.kh.jdbc.board.model.dao.CommentDAO;

/**
 * @author user1
 *
 */
public class CommentService {

	CommentDAO commentDao = new CommentDAO();
	
	/** 댓글 등록 서비스
	 * @param cotent
	 * @param boardNo
	 * @param memberNO
	 * @return
	 * @throws Exception
	 */
	public int insertComment(String cotent, int boardNo, int memberNO) throws Exception {
		
		Connection conn = getConnection();
		
		int commentNO = commentDao.nextCommentNO(conn);
		
		int result = commentDao.insertComment(conn,commentNO,cotent,boardNo,memberNO);
		
		if(result>0) {
			commit(conn);
		}
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 본인이 쓴 댓글 맞는지 확인하는 서비스
	 * @param boardNo
	 * @param commentNo
	 * @param memberNO
	 * @return
	 * @throws Exception
	 */
	public int correctComment(int boardNo, int commentNo, int memberNO) throws Exception {
		Connection conn = getConnection();
		
		int corr = commentDao.correctComment(conn,boardNo,commentNo,memberNO);
				
		close(conn);
		
		return corr;
		
	}

	/** 댓글 수정 서비스
	 * @param updateComment
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public int updateComment(String updateComment, int commentNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = commentDao.updateComment(conn,updateComment,commentNo);
		
		if(result>0) {
			commit(conn);
		}
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 댓글 삭제 서비스
	 * @param commentNo
	 * @return
	 * @throws Exception
	 */
	public int deleteComment(int commentNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = commentDao.deleteComment(conn,commentNo);
		
		if(result>0) {
			commit(conn);
		}
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

}
