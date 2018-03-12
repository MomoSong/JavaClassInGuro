package board.service;

import board.dao.NadoNewsBoardDAO;
import dto.NadoNewsBoardDTO;

public class NadoNewsViewService {
	public NadoNewsBoardDTO process(int no){
		NadoNewsBoardDAO boardDAO = new NadoNewsBoardDAO();
		boardDAO.increase(no);
		return boardDAO.view(no);
	}
}
