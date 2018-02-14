package project;

import dto.BoardDTO;

public class BoardDTOTest {
	public static void main(String[] args) {
		//기세판의 데이터를 담기 위해 게시판 객체 생성
		BoardDTO boardDTO = new BoardDTO();
		System.out.println(boardDTO);
		
		boardDTO.setNo(10);
		boardDTO.setTitle("자바");
		System.out.println(boardDTO);
		
		//게시판 글쓰기
		String title = "오라클";
		String content = "데이터를 저장하는 프로그램";
		String writer = "송근모";
		
		
		BoardDTO boardDTO1 = new BoardDTO(title, content, writer);
		System.out.println(boardDTO1);
	}
}
