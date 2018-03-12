package board.controller;

import java.util.ArrayList;
import java.util.List;

import board.dao.NadoNewsCrawlingDAO;
import board.print.NadoNewsBoardPrint;
import board.service.NadoNewsCrawlingService;
import board.service.NadoNewsDeleteService;
import board.service.NadoNewsListService;
import board.service.NadoNewsUpdateService;
import board.service.NadoNewsViewService;
import board.service.NadoNewsWriteService;
import board.util.InUtil;
import dto.NadoNewsBoardDTO;

public class NadoNewsController {
	private List<NadoNewsBoardDTO> list;
	private NadoNewsBoardDTO boardDTO;
	private NadoNewsBoardPrint boardPrint;
	private int no;
	private String title;
	private String content;
	private String writer;

	public void selectMenu(){
		
				
		while(true){			
			String menu = InUtil.getMenu("1.기사 목록 "
								+"2.기사 읽기 "
								+"3.기사 쓰기 "
								+"4.기사 수정 "
								+"5.기사 삭제 "
								+"6.기사 로드 "
								+"0.이전 메뉴", "메뉴를 입력하세요 >");			
			switch (menu) {
			case "1":
				NadoNewsListService nadoNewsListService = new NadoNewsListService();
				if (list == null) list = new ArrayList<NadoNewsBoardDTO>();
				list = nadoNewsListService.process();
				if(boardPrint == null) boardPrint = new NadoNewsBoardPrint();
				boardPrint.listPrint(list);
				break;
				
			case "2":
				no = InUtil.getInt("기사 번호를 입력하세요 >");
				NadoNewsViewService nadoNewsViewService = new NadoNewsViewService();
				if (boardDTO == null) boardDTO = new NadoNewsBoardDTO();
				boardDTO = nadoNewsViewService.process(no);
				if(boardPrint == null) boardPrint = new NadoNewsBoardPrint();
				boardPrint.viewPrint(boardDTO);
				break;
				
			case "3":
				title = InUtil.getMenu("제목을 입력하세요>");
				content = InUtil.getMenu("본문을 입력하세요>");
				writer = InUtil.getMenu("작성자를 입력하세요>");
				NadoNewsWriteService nadoNewsWriteService = new NadoNewsWriteService();
				nadoNewsWriteService.write(title, content, writer);
				break;

			case "4":
				no = InUtil.getInt("수정할 기사 번호를 입력하세요>");
				title = InUtil.getMenu("제목을 입력하세요>");
				content = InUtil.getMenu("본문을 입력하세요>");
				writer = InUtil.getMenu("작성자를 입력하세요>");
				
				NadoNewsUpdateService nadoNewsUpdateService = new NadoNewsUpdateService();
				nadoNewsUpdateService.update(title, content, writer, no);
				
				break;
			
			case "5":
				no = InUtil.getInt("삭제할 기사 번호를 입력하세요>");
				NadoNewsDeleteService nadoNewsDeleteService = new NadoNewsDeleteService();
				nadoNewsDeleteService.delete(no);
				break;
			
			case "6":
				NadoNewsCrawlingService nadoNewsCrawlingService = new NadoNewsCrawlingService();
				nadoNewsCrawlingService.nadoNewsCrawling();
				
				break;
				
			case "0":
				return;
			
			default:
				System.out.println("잘못된 메뉴를 입력 하셨습니다.");
				break;
			}
			
		}
	}
}
