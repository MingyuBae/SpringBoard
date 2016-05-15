package com.asuscomm.ktbk.board.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asuscomm.ktbk.board.domain.model.Post;

public interface PostDao extends JpaRepository<Post, Integer>{ 
	
}
