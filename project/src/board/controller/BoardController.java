package board.controller;

import project.Main;

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
				break;
			case "2":
				System.out.println("게시판 글 보기");
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
