package board.controller;

import java.util.List;

import board.service.BoardListService;
import board.service.BoardViewService;
import dto.BoardDTO;
import project.Main;
import view.board.BoardPrint;

/*
 * 
 * 메뉴를 보여주고 선택하면 처리한다. 반복 처리한다. 
 *
 */
public class BoardController {
	public void selectMenu() {
		System.out.println("BoardController.selectMenu()");
		
		while (true) {
			// 메뉴 출력
			System.out.println("1.List 2.View 3.Write");
			System.out.println("4.Update 5.Delete 0.이전메뉴");
			System.out.println("메뉴 선택 -> ");
			
			// 메뉴 선택
			String menu = Main.scanner.nextLine();
			
			// 메뉴 처리
			switch (menu) {
			case "1":
				System.out.println("게시판 리스트");
				//리스트를 처리하는 객체 생성, 호출
				//객체 생성
				
				BoardListService boardListService
				 = new BoardListService();
				
				//메서드를 호출해서 실행해서 데이터 가져오기
				List<BoardDTO> list = boardListService.process();
				
				BoardPrint boardPrint = new BoardPrint();
				boardPrint.list(list);
				//가져온 데이터를 출력하기
				
				
				break;
			case "2":
				//글번호에 맞는 게시판의 데이터를 가져온다. BoardDTO
				//객체를 생성하고 호출한다. controller -> service -> dao
				System.out.println("게시판 글 보기");
				System.out.println("글 번호를 누르세요:");
				String no = Main.scanner.nextLine();
				
				BoardViewService boardViewService =
						new BoardViewService();
				
				BoardDTO boardDTO
					= boardViewService.process(Integer.parseInt(no));
				BoardPrint viewPrint = new BoardPrint();
				viewPrint.view(boardDTO);
				
				break;
			case "3":
				System.out.println("게시판 글 쓰기");
				break;
			case "4":
				System.out.println("게시판 글 수정");
				break;
			case "5":
				System.out.println("게시판 글 삭제");
				break;
			case "0":
				System.out.println("메인 메뉴로 이동");
				return;

			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				System.out.println("다시 메뉴를 선택해 주세요.");
				break;
			}
			
		}
	}
}
