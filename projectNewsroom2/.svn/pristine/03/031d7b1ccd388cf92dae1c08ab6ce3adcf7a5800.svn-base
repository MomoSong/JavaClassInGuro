package com.webjjang.view.board;

import java.util.List;

import com.webjjang.board.dto.NadoNewsBoardDTO;
import com.webjjang.board.dto.NewsDTO;

//public class NewsPrint {
//
//	public void list(List<NewsDTO> list) {
//		// TODO Auto-generated method stub
//		System.out.println("NewsPrint.list()");
//		
//		// 제목출력
//		System.out.println("\n\n*** 게시판 리스트  ***");
//		System.out.println("---------------------------------------------------------------------");
//		System.out.println(" 번호                                제목                                                                                     작성일                              조회수");
//		System.out.println("---------------------------------------------------------------------");
//		
//		for(NewsDTO newsDTO: list)
//			System.out.println(
//					  newsDTO.getNo() + "  "
//					+ newsDTO.getTitle() + "  "
//					+ newsDTO.getPubDate() + "  "
//					+ newsDTO.getHit() + "  " );
//		System.out.println("----------------------------");
//	}
//	// TODO Auto-generated method stub
//	public void view(NewsDTO newsDTO) {
//	System.out.println("NewsPrint.view()");
//	
//	// 제목출력
//	System.out.println("\n\n*** 게시판 리스트  ***");
//	System.out.println("---------------------------------------------------------------------------");
//	System.out.println(" 번호                                                                  제목                                주소                     내용                       작성일        조회수");
//	System.out.println("---------------------------------------------------------------------------");
//	
//	if(newsDTO == null)
//		System.out.println("데이터가 없습니다.");
//	else
//		System.out.println(newsDTO);
//	System.out.println("----------------------------");
//}
	public class NewsPrint {
		public void list(List<NewsDTO> list){
			System.out.println("NewsPrint.list()");
			for(int i = 0; i < list.size(); i++){
				printUtil(list.get(i));
			}
			
		}
		//기사 본문을 출력한다. (50번째 문자마다 개행을 한다.)
		public void view(NewsDTO newsDTO){
			System.out.println("NewsPrint.view()");
			printUtil(newsDTO);
			System.out.println("--------------------------------------------------");
			System.out.println("URL:   "+newsDTO.getUrl());
			System.out.println("요약내용:   "+newsDTO.getContent());
			System.out.println("--------------------------------------------------");
		}
	
	
	//printf를 이용해서 각각의 자릿수에 맞게 변수들을 호출한다. 기사 본문은 나중에 출력하고. 일단 넘버, 제목, 작성자, 작성일, 조회수만 위에 출력한다.
	private void printUtil(NewsDTO newsDTO){
		System.out.printf("[%3d][%-20s][%15s][%3s]\n"
				, newsDTO.getNo()
				, newsDTO.getTitle()
				, newsDTO.getPubDate()
				, newsDTO.getHit()
				);
	}
}
