package board.print;

import java.util.List;

import dto.NadoNewsBoardDTO;

public class NadoNewsBoardPrint {
	public void listPrint(List<NadoNewsBoardDTO> list){
		for(int i = 0; i < list.size(); i++){
			printUtil(list.get(i));
		}
		
	}
	
	public void viewPrint(NadoNewsBoardDTO boardDTO){
		printUtil(boardDTO);
		System.out.println("-----------------------------------------");
		System.out.println(boardDTO.getContent());
		System.out.println("-----------------------------------------");
	}
	
	private void printUtil(NadoNewsBoardDTO boardDTO){
		System.out.printf("[%3d][%20s][%5s][%10s][%3d]\n"
				, boardDTO.getNo()
				, boardDTO.getTitle()
				, boardDTO.getWriter()
				, boardDTO.getWriteDate()
				, boardDTO.getHit());
	}
	
}
