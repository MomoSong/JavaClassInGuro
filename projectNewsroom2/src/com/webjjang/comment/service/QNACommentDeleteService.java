package com.webjjang.comment.service;

import web.webjjang.comment.dao.QNACommentDAO;

public class QNACommentDeleteService {

	public void delete(int no) throws Exception {
//		System.out.println("QNACommentDeleteService.delete()");
		QNACommentDAO qnaCommentDAO = new QNACommentDAO();
		qnaCommentDAO.delete(no);
	}
}
