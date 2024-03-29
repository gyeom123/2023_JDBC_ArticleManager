package com.KoreaIT.example.Dto;

import java.time.LocalDateTime;
import java.util.Map;

public class Article {
	public int id;
	public int memberId;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public String title;
	public String body;
	public String writerName;
	public int views;

	public Article(Map<String, Object> articleMap) {
		this.id = (int) articleMap.get("id");
		this.memberId = (int) articleMap.get("memberId");
		this.regDate = (LocalDateTime) articleMap.get("regDate");
		this.updateDate = (LocalDateTime) articleMap.get("updateDate");
		this.title = (String) articleMap.get("title");
		this.body = (String) articleMap.get("body");
		this.writerName = (String) articleMap.get("writerName");
		this.views = (int) articleMap.get("views");
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", regDate=" + regDate + ", updateDate=" + updateDate + ", title=" + title
				+ ", body=" + body + "]";
	}

}
