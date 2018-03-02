package com.webjjang.boardController;

import java.util.List;

import com.webjjang.boardService.BoardListService;
import com.webjjang.boardService.BoardViewService;
import com.webjjang.dto.BoardDTO;
import com.webjjang.util.InUtil;
import com.webjjang.viewBoard.BoardPrint;



/*
 * 메뉴를 보여주고 선택하면 처리한다.
 * 반복처리한다.
 */

public class BoardController {

	public void selectMenu() {
//		System.out.println("BoardController.selectMenu()");
		
		while (true) {
			String menu = InUtil.getMenu("1.List 2.View 3.Write"
										+"4.Update 5.Delect 0.MainMenu",
										"메뉴 선택"); 

			BoardListService boardlistservice = new BoardListService();
			List<BoardDTO> list;
			list = boardlistservice.process();

			// 메뉴선택
			switch (menu) {
			case "1":
//				System.out.println("게시판 리스트");
				// 리스트를 처리하는 객체 생성, 호출
				BoardPrint boardprit = new BoardPrint();
				boardprit.list(list);
				break;
			case "2":
//				System.out.println("게시판 글보기");
				int no = InUtil.getIntWithCheck("글번호 입력");
				// 글번호에 맞는 게시판의 데이터를 가져온다. BoardDTO
				// 객체를 생성하고 호출한다. controller -> service ->data
				BoardViewService boardViewService = new BoardViewService();
				BoardDTO boardPrint2 = boardViewService.process(no);
				BoardPrint boardPrint3 = new BoardPrint();
				boardPrint3.view(boardPrint2);
				break;
			case "3":
				System.out.println("게시판 글쓰기");
				break;
			case "4":
				System.out.println("게시판 글수정");
				break;
			case "5":
				System.out.println("게시판 글삭제");
				break;
			case "0":
				System.out.println("메인메뉴 이동");
				return;
			default:
				System.out.println("잘못된 메뉴를 출력하였습니다");
				System.out.println("다시메뉴를 선택해주세요");
				break;
			}
			// 메뉴 처리
			//
		}
	}

}
