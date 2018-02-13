package dto;

/*
 * 게시판 데이터를 저장하는 객체
 * 2018.2.13
 * 송근모
 * 번호, 제목, 내용, 작성자, 작성일, 조회수
 */

public class BoardDTO {
	
	private int no;
	private String title;
	private String content;
	private String writer;
	private String writeDate;
	private int hit;
	
	//생성자 선언
	//생성을 먼저하고 값은 나중에 넣겠다.
	public BoardDTO() {
		
	}
	
	//데이터를 넣을 떄 데이터가 준비가 다 되어 있는 경우
	public BoardDTO(int no, String title, String content, 
			String writer, String writeDate, int hit) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.hit = hit;
	}
		
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title 
				+ ", content=" + content + ", writer=" + writer
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}
	
	
	
	
}
