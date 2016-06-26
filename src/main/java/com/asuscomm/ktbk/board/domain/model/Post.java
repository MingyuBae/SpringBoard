package com.asuscomm.ktbk.board.domain.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@JsonAutoDetect
public class Post {
	@Id
	@GeneratedValue
	Integer boardId;
	String userId;
	String title;
	Integer category;
	Date regDate;
	String content;
	Boolean deleted;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	List<Comment> commentList;
	
	public Post(){
		
	}
	
	public Post(Integer boardId){
		this.boardId = boardId;
	}
	
	
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	
	@Override
	public String toString() {
		return "Post [boardId=" + boardId + ", userId=" + userId + ", title=" + title + ", category=" + category
				+ ", regDate=" + regDate + ", content=" + content + ", deleted=" + deleted + ", commentList="
				+ commentList + "]";
	}
}
