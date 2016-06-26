package com.asuscomm.ktbk.board.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asuscomm.ktbk.board.domain.model.Post;

public interface PostDao extends JpaRepository<Post, Integer>{ 
	public List<Post> findByDeletedOrderByBoardId(Boolean deleted);
}
