package edu.kh.project.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.board.model.dto.Board;

public interface BoardService {

	// 게시판 종류 목록 조회
	List<Map<String, Object>> selectBoardTypeList();

	// 게시글 목록 조회
	Map<String, Object> selectBoardList(int boardCode, int cp);

	

}
