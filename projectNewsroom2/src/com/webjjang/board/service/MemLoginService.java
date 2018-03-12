package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.controller.ProcessInterface;
import com.webjjang.board.dao.MemDAO;
import com.webjjang.board.dto.MemberDTO;
import com.webjjang.board.dto.NewsDTO;

public class MemLoginService implements ProcessInterface {

	public MemberDTO process(String id, String pw) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BoardLoginService.process()");
		MemberDTO memberDTO = null;
		MemDAO memDAO = new MemDAO();
		memberDTO = memDAO.login(id, pw);
		return memberDTO;
	}

	@Override
	public Object process(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsDTO> process() {
		// TODO Auto-generated method stub
		return null;
	}

}
