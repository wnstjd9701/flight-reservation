package com.project.myapp.board.model;



import java.sql.Timestamp;

import lombok.Data;


@Data
public class Board {
	private int boardId;
	private int categoryId;
	private String memberId;
	private String title;
	private String content;
	private int views;
	private Timestamp createdAt;
	private Timestamp updatedAt;
}
