package boardController;

import java.util.List;

import dto.BoardDTO;
import board.service.BoardListService;
import board.service.BoardViewService;
import project.Main;
import view.board.BoardPrint;

/*
 * 메뉴를 보여주고 선택하면 처리한다.
 * 반복처리한다.
 */

public class BoardController {

	public void selectMenu() {
		System.out.println("BoardController.selectMenu()");
		// 메뉴 선택
		while (true) {
			// 메뉴 출력
			System.out.println("1.List 2.View 3.Write");
			System.out.println("4.Update 5.Delect 0.MainMenu");
			System.out.print("메뉴선택 ->");

			String menu = Main.scanner.nextLine();

			BoardListService boardlistservice = new BoardListService();
			List<BoardDTO> list;
			list = boardlistservice.process();

			// 메뉴선택
			switch (menu) {
			case "1":
				System.out.println("게시판 리스트");
				// 리스트를 처리하는 객체 생성, 호출
				BoardPrint boardprit = new BoardPrint();
				boardprit.list(list);
				break;
			case "2":
				System.out.println("게시판 글보기");
				int no = 2;
				// 글번호에 맞는 게시판의 데이터를 가져온다. BoardDTO
				// 객체를 생성하고 호출한다. controller -> service ->data
				BoardViewService boardviewservice = new BoardViewService();
				BoardDTO boardPrint2 = boardviewservice.process(no);
				BoardPrint boardprit3 = new BoardPrint();
				boardprit3.view(boardPrint2);
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
