package view.board;

import java.util.List;

import dto.BoardDTO;

public class BoardPrint {
	public void list(List<BoardDTO> list) {
		System.out.println("BoardPrint.list()");
		System.out.println("**게시판 리스트**");
		try {
			for(BoardDTO boardDTO : list) {
				System.out.println(boardDTO);
			}			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("데이터가 존재하지 않습니다.");
		}
	}
}
