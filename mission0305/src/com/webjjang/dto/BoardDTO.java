package com.webjjang.dto;

public class BoardDTO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private String writedate;
	private int hit;
	
	BoardDTO(){}

	public BoardDTO(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public BoardDTO(int no, String title, String writer, String writedate, int hit) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.writedate = writedate;
		this.hit = hit;
	}

	public BoardDTO(int no, String title, String content, String writer, String writedate, int hit) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writedate = writedate;
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

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
