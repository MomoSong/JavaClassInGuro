package com.webjjang.board.service;


import java.util.List;

import com.webjjang.board.controller.ProcessInterface;
import com.webjjang.board.dao.MemDAO;
import com.webjjang.board.dto.MemberDTO;
import com.webjjang.board.dto.NewsDTO;

public class MemUpdateService implements ProcessInterface{

	public MemberDTO process(String Id, String updatePw, String updateName, String updateNick, String updateTel, String updateEmail) throws Exception{
		// TODO Auto-generated method stub
		MemberDTO mmc = null;
		MemDAO memDAO = new MemDAO();
		mmc = memDAO.update(Id, updatePw,updateName,updateNick,updateTel,updateEmail);
		return mmc;
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
