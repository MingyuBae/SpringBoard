package com.asuscomm.ktbk.board.domain.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asuscomm.ktbk.board.domain.model.Comment;
import com.asuscomm.ktbk.board.domain.model.Post;
import com.asuscomm.ktbk.board.infrastructure.dao.CommentDao;
import com.asuscomm.ktbk.board.infrastructure.dao.PostDao;

@Service
public class BoardService {
	@Autowired
	PostDao postDao;
	@Autowired
	CommentDao commentDao;
	
	/**
	 * 게시판 글 등록 로직
	 * @param postData 등록하려는 데이터
	 * @return
	 */
	public Post writePost(Post postData) {
		postData.setRegDate(new Date());
		postData.setDeleted(false);
		
		postData = postDao.save(postData);
		return postData;
	}
	
	/**
	 * 게시물 댓글 등록 로직
	 * @param commentData 등록할 댓글 내용
	 * @param boardId 댓글을 등록할 게시물
	 * @return
	 */
	public Comment writeComment(Comment commentData, Integer boardId){
		Post postData = postDao.getOne(boardId);
		commentData.setPost(postData);
		commentData.setRegDate(new Date());
		commentData = commentDao.save(commentData);
		
		return commentData;
	}
	
	
}
