package com.asuscomm.ktbk.board.domain.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asuscomm.ktbk.board.domain.model.Post;
import com.asuscomm.ktbk.board.infrastructure.dao.CommentDao;
import com.asuscomm.ktbk.board.infrastructure.dao.PostDao;

@Service
public class BoardService {
	@Autowired
	PostDao postDao;
	@Autowired
	CommentDao commentDao;
	
	public Post writePost(Post postData) {
		postData.setRegDate(new Date());
		postData = postDao.save(postData);
		return postData;
	}
	
	
}
