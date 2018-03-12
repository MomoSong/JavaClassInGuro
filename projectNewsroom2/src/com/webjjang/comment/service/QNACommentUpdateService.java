package com.webjjang.comment.service;

import web.webjjang.comment.dao.QNACommentDAO;

public class QNACommentUpdateService {

	public void update(String content, String writer, int no) {
//		System.out.println("QNACommentUpdateService.process()");
		
		// list에 데이터를 가져와서 채우는 프로그램을 작성, 채운것을 return
		// 객체 생성 및 호출
		QNACommentDAO qnaCommentDAO = new QNACommentDAO();
		qnaCommentDAO.update(content, writer, no);
	}
}
