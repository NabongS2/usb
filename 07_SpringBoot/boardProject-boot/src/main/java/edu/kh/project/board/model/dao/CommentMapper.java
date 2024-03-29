package edu.kh.project.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.board.model.dto.Comment;

@Mapper // DB 관련 + bean 등록 (IOC)
public interface CommentMapper {
	

	/** 댓글 목록 조회
	 * @param boardNo
	 * @return cList
	 */
	public List<Comment> select(int boardNo);

	/** 댓글 삽입
	 * @param comment
	 * @return
	 */
	public int insert(Comment comment);

	/** 댓글 삭제
	 * @param commmetNo
	 * @return
	 */
	public int delete(int commentNo);

	/** 댓글 수정
	 * @param comment
	 * @return
	 */
	public int update(Comment comment);
}
