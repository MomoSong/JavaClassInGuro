package com.webjjang.boardService;

import com.webjjang.boardDao.BoardDAO;
import com.webjjang.dto.BoardDTO;

//Controller -> service -> dao 순으로 처리

public class BoardViewService {
	public BoardDTO process(int no){
		//글번호를 받아서 알맞는 데이터를 가져온다.
//		System.out.println("BoardViewService.process()");
		BoardDTO boardDTO = new BoardDTO();
		//글번호에 맞는 boardDTO에 데이터를 가져와서 채우는 프로그램 작성
		//객체 생성하고 호출
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.view(no);
		
		
		return boardDTO;
	}
}
