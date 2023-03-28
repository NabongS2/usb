package edu.kh.jdbc.board.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.board.model.dao.BoardDAO;
import edu.kh.jdbc.board.model.dto.Board;

// 데이터를 가공, 트랜잭션 처리
public class BoardService {

	private BoardDAO dao = new BoardDAO();
	
	public static void main(String[] args) {
		
	}

	/** 게시글 목록 조회 서비스
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectAllBoard() throws Exception {
		
		// 커넥션 생성
		Connection conn = getConnection();
		
		// DAO 메서드 호출
		List<Board> boardList = dao.selectAllBoard(conn);
		
		// 커넥션 반환
		close(conn);
		
		return boardList;
	}

	/** 게시글 조회 서비스
	 * @param input
	 * @param memberNO
	 * @return board
	 * @throws Exception
	 */
	public Board selectBoard(int input, int memberNO) throws Exception {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. 게시글 상세 조회 DAO 메서드 호출
		Board board = dao.selectBoard(conn,input);
		
		// 3. 게시글이 조회 된 경우
		if(board != null) {
			
			// 4. 조회수 증가
			// 단, 게시글 작성자와 로그인한 회원이 다를 경우에만 증가
			if(board.getMemberNO() != memberNO) {
			// 조회한 게시글 회원 번호 != 로그인한 회원 번호
				
				// 5. 조회 수 증가 DAO 메서드 호출(UPDATE)
				int result = dao.updateReadCount(conn, input);
				
				// 6. 트랜잭션 제어 처리 + 데이터 동기화 처리
				if(result>0) {
					commit(conn);
					// 조회된 board의 조회수 0
					// DB의 조회수는 1
					board.setReadCount(board.getReadCount()+1);
				} else {
					rollback(conn);
				}
			}
 		}
		
		// 7. 커넥션 반환
		close(conn);
		
		// 8. 결과 반환
		return board;
	}

	/** 게시글 수정 서비스
	 * @param boardTitle
	 * @param string
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */					 // sb.toString을 갖고와서 이름을 알 수 없어 string 으로 가져와짐 이름 수정
	public int updateBoard(String boardTitle, String boardContent, int boardNo) throws Exception {
		
		Connection conn = getConnection();
		
		// 게시글 수정 DAO 호출
		int result = dao.updateBoard(conn, boardTitle, boardContent, boardNo);
		
		// 트랜잭션 처리
		if(result>0) commit(conn);
		else		 rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 게시글 삭제 서비스
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public int deleteBoard(int boardNo) throws Exception {
		Connection conn = getConnection();
		
		int result = dao.deleteBoard(conn,boardNo);
		
		if(result>0) commit(conn);
		else		 rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 게시글 삽입 서비스
	 * @param title
	 * @param string
	 * @param memberNO
	 * @return
	 * @throws Exception
	 */
	public int insertBoard(String title, String content, int memberNO) throws Exception {
		
		Connection conn = getConnection();
		
		// 다음 게시글 번호 생성 -> 4
		int boardNo = dao.nextBoardNo(conn);
		
		// 제목, 내용, 회원번호 + 다음 게시글 번호(4)
		int result = dao.insertBoard(conn,title,content,memberNO,boardNo);
		
		if(result>0) {
			commit(conn);
			result = boardNo;
		} else rollback(conn);
		
		close(conn);
		
		return result; // 삽입 성공 시 다음 게시글 번호
					   // 실패 시 0
	}

}
