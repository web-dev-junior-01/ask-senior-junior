package com.askSenior.app.question;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class QuestionFrontController extends HttpServlet{
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
		
		if(target.equals("/question/listAll.ques")) {
			//전체 질문 목록
			
		}else if(target.equals("/question/listLife.ques")) {
			//생활 목록
			
		}else if(target.equals("/question/listBusiness.ques")) {
			//업무 및 회사생활 목록
			
		}else if(target.equals("/question/listRecruitment.ques")) {
			//채용 목록
			
		}else if(target.equals("/question/listImprovement.ques")) {
			//자기계발 목록
			
		}else if(target.equals("/question/listInvestment.ques")) {
			//제테크 목록
			
		}else if(target.equals("/question/listFoundation.ques")) {
			//창업 목록
			
		}else if(target.equals("/question/listEtc.ques")) {
			//기타 목록
			
		}else if(target.equals("/question/writerDetail.ques")) {
			//질문 작성자 상세보기
			
		}else if(target.equals("/question/detail.ques")) {
			//질문을 눌러서 상세보기
			
		}else if(target.equals("/question/topList.ques")) {
			//화제의 질문
			
		}else if(target.equals("/question/recommend.ques")) {
			//질문 추천 선택
			
		}else if(target.equals("/question/recommendCancel.ques")) {
			//질문 추천 해제
			
		}else if(target.equals("/question/like.ques")) {
			//질문 좋아요 선택
			
		}else if(target.equals("/question/likeCancel.ques")) {
			//질문 좋아요 해제
			
		}else if(target.equals("/question/scrap.ques")) {
			//질문 스크랩
			
		}else if(target.equals("/question/scrapCancel.ques")) {
			//질문 스크랩 해제
		
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





























