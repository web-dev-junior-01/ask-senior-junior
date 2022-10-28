package com.askSenior.app.admin;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AdminFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		//Result result = null;
		
		if(target.equals("/admin/memberList.admin")) {
			//전체 멤버 목록
			
		}else if(target.equals("/admin/memberDetail.admin")) {
			//멤버 상세 보기
			
		}else if(target.equals("/admin/memberUpdate.admin")) {
			//멤버 수정 하기
			
		}else if(target.equals("/admin/questionList.admin")) {
			//전체 질문 목록
			
		}else if(target.equals("/admin/questionDetail.admin")) {
			//질문 상세 보기
			
		}else if(target.equals("/admin/questionRemove.admin")) {
			//질문 삭제
			
		}else if(target.equals("/admin/answerList.admin")) {
			//전체 답변 목록
			
		}else if(target.equals("/admin/answerDetail.admin")) {
			//답변 상세 보기
			
		}else if(target.equals("/admin/answerRemove.admin")) {
			//답변 삭제
			
		}else if(target.equals("/admin/lectureList.admin")) {
			//전체 강연 목록
			
		}else if(target.equals("/admin/lectureDetail.admin")) {
			//강연 상세 보기
			
		}else if(target.equals("/admin/noticeList.admin")) {
			//공지 사항 
			
		}else if(target.equals("/admin/noticeDetail.admin")) {
			//공지 사항 상세 보기
			
		}else if(target.equals("/admin/noticeUpdate.admin")) {
			//공지 사항 작성하기
			
		}
			
			
//		if(result != null) {
//			if(result.isRedirect()) {
//				resp.sendRedirect(result.getPath());
//			}else {
//				req.getRequestDispatcher(result.getPath()).forward(req, resp);
//			}
//			
//		}
		
	}

}





























