package edu.kh.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 등록 + 주소 연결
@WebServlet("/test/result")
public class TestController extends HttpServlet{
	
	// GET 방식 요청 처리 메서드 오버라이딩
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라미터 사용 X, 값 세팅 X
		// -> 바로 JSP로 위임 코드 작성

		RequestDispatcher dispatcher
			= req.getRequestDispatcher("/WEB-INF/views/testResult.jsp");
		
		dispatcher.forward(req, resp);
		
		
	}
}
