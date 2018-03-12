package com.webjjang.board.service;

import java.sql.SQLException;
import java.util.List;

import com.webjjang.board.controller.ProcessInterface;
import com.webjjang.board.dao.NewsDAO;
import com.webjjang.board.dto.NewsDTO;

public class NewsDeleteService implements ProcessInterface{

	public void process(int no) throws SQLException {
		// TODO Auto-generated method stub
		NewsDAO newsDAO = new NewsDAO();
		newsDAO.delete(no);
	}

	@Override
	public Object process(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}



}
