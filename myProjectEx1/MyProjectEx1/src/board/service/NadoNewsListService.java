package board.service;

import java.util.ArrayList;
import java.util.List;

import board.dao.NadoNewsBoardDAO;
import dto.NadoNewsBoardDTO;

public class NadoNewsListService {
	List<NadoNewsBoardDTO> list = new ArrayList<NadoNewsBoardDTO>();
	
	public List<NadoNewsBoardDTO> process(){
		NadoNewsBoardDAO boardDAO = new NadoNewsBoardDAO();
		list = boardDAO.list();
		return list;
	}
}
