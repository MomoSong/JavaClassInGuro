package board.dao;

import java.util.List;

import dto.BoardDTO;

public class BoardDAO {
	
	//글리스트를 가져오는 메서드
	public List<BoardDTO> list(){
		System.out.println("BoardDAO.list");
		List<BoardDTO> list = null;
		//RDBMS에서 데이터를 가져오는 프로그램 작성
		return list;
	}
	
	//글번호에 맞는 글보기 데이터를 가져오는 메서드
	public BoardDTO view(int no){
		System.out.println("BoardDAO.view() - " + no);
		BoardDTO boardDTO = null;
		
		//오라클에서 데이터를 가져와서 채우는 프로그램 작성
		
		return boardDTO;
	}
}
