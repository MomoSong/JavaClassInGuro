package board.service;

import board.dao.NadoNewsBoardDAO;
import dto.BoardDTO;

public class NadoNewsViewService {
	public BoardDTO process(int no){
		NadoNewsBoardDAO boardDAO = new NadoNewsBoardDAO();
		boardDAO.increase(no);
		return boardDAO.view(no);
	}
}
