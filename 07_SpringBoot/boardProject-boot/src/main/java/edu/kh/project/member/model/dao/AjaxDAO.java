package edu.kh.project.member.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.member.model.dto.Member;

/**
 * @author user1
 *
 */
@Repository // DB 연결을 의미  
public class AjaxDAO {

	@Autowired // bean 중에서 타입이 같은 객체를 DI
	private AjaxMapper mapper;
//	private SqlSessionTemplate sqlSession;


    /** 이메일로 닉네임 조회 
     * @param email
     * @return
     */
    public String selectNickname(String email) {
       return mapper.selectNickname(email);
    }

	/** 닉네임으로 전화번호 조회
	 * @param nickname
	 * @return
	 */
	public String selectMemberTel(String nickname) {
		
		return mapper.selectMemberTel(nickname);
	}

	/** 이메일 중복 검사
	 * @param email
	 * @return
	 */
	public int checkEmail(String email) {
		return mapper.checkEmail(email);
	}
	
	/** 닉네임 중복 검사
	 * @param nickname
	 * @return
	 */
	public int checkNickname(String nickname) {
		return mapper.checkNickname(nickname);
	}

	
	/** 이메일로 회원 정보 조회
	 * @param email
	 * @return
	 */
	public Member selectMember(String email) {
		return mapper.selectMember(email);
	}

	/** 이메일이 일부라도 일치하는 모든 회원 조회
	 * @param input
	 * @return
	 */
	public List<Member> selectMemberList(String input) {
		return mapper.selectMemberList(input);
	}
}
