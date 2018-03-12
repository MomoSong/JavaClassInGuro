package com.webjjang.comment.service;

import com.webjjang.comment.dto.QNACommentDTO;

import web.webjjang.comment.dao.QNACommentDAO;

public class QNACommentViewService {

	// 글 번호를 받아서 댓글을 가져온다.
	public QNACommentDTO process(int no) {
		QNACommentDTO qnaCommentDTO = null;
		
		// 객체를 생성하여 호출한다.
		QNACommentDAO qnaCommentDAO = new QNACommentDAO();
		// 댓글을 가져온다.
		qnaCommentDTO = qnaCommentDAO.view(no);
		return qnaCommentDTO;
	}
}
