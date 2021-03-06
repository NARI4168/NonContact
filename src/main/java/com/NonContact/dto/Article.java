package com.NonContact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //toString, GettersSetters
@NoArgsConstructor //인자없는 생성자
@AllArgsConstructor //생성자
public class Article extends EntityDto{
	private int id;
	private String regDate;
	private String updateDate;
	private int boardId;
	private int memberId;
	private String writer;
	private String title;
	private String body;
	
	private String extra_writer;
	private String extra__boardName;
	private String extra__thumbImg;
	
	public String getWriterThumbImgUrl() {
		return "/common/genFile/file/member/" + memberId + "/common/attachment/1";
	}

}
