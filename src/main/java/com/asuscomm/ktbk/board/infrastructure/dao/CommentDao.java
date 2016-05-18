package com.asuscomm.ktbk.board.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asuscomm.ktbk.board.domain.model.Comment;
import com.asuscomm.ktbk.board.domain.model.Post;

public interface CommentDao extends JpaRepository<Comment, Integer>{
	public List<Comment> findByPost(Post post);
}
