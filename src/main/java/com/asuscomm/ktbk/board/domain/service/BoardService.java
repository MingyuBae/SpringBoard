package com.asuscomm.ktbk.board.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asuscomm.ktbk.board.infrastructure.dao.PostDao;

@Service
public class BoardService {
	@Autowired
	PostDao postDao;
	
	
}
