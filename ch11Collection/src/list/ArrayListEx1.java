package list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add("이영환");
		list1.add(LocalDate.now());

		// for(int i =0; i < list1.size(); i++) {
		// System.out.println(list.get(i));
		// }
		// 자료형이 달라서 출력 불가능. 안정성을 위해 지네릭스를 사용해야 한다.
		for(Object obj: list1) {
			System.out.println(obj);
		}
		
		List<String> list2 = new ArrayList<>();
		list2.add("자바");
		list2.add("오라클");
		list2.add("파이썬");
		//list2에서 데이터를 하나를 꺼내면 Object이기 때문에 형변환(캐스팅)
		//해서 사용해야 한다. 그러나 제네릭스를 이용해서 넣을 데이터를 한정한 경우는
		//자동 캐스팅 된다.
		for(String s: list2) System.out.println(s);
		
		//게시판의 데이터를 list에 담아본다.(boardDTO)
		//BoardDAO에서 데이터를 담는 경우
		List<BoardDTO> list3 = new ArrayList<>();
		list3.add(new BoardDTO("java", "java jjang", "lee"));
		list3.add(new BoardDTO("oracle", "oracle jjang", "lee"));
		list3.add(new BoardDTO("mongoDB", "big data", "lee"));
		
		//BoardPrint로 출력을 하는 경우
		for(BoardDTO boardDTO : list3) {
			System.out.println(boardDTO);
		}
		
		System.out.println(list3);
		
	}

}
