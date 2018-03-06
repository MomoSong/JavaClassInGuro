package board.service;

import java.util.ArrayList;
import java.util.List;

import board.dao.NadoNewsBoardDAO;
import dto.BoardDTO;

public class NadoNewsListService {
	List<BoardDTO> list = new ArrayList<BoardDTO>();
	
	public List<BoardDTO> process(){
		NadoNewsBoardDAO boardDAO = new NadoNewsBoardDAO();
		list = boardDAO.list();
		return list;
	}
}
