package edu.kh.project.myPage.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.dao.MyPageDAO;

@Service // 비즈니스 로직 처리 클래스 + Bean 등록 (IOC)
public class MyPageServiceImpl implements MyPageService{
   
   @Autowired  // MyPageDAO 의존성 주입(DI)
   private MyPageDAO dao;

   // 회원 정보 수정 서비스
   @Transactional(rollbackFor = {Exception.class})
   @Override
   public int updateInfo(Member updateMember) {
   
      return dao.updateInfo(updateMember);
   }

}