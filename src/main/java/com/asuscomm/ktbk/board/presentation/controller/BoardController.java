package com.asuscomm.ktbk.board.presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asuscomm.ktbk.board.domain.model.Post;
import com.asuscomm.ktbk.board.infrastructure.dao.PostDao;

@Controller
public class BoardController {
	@Autowired
	PostDao postDao;
	
	@RequestMapping("/")
	public String index(Model model, String text){
		List<Post> postList = postDao.findAll();
		model.addAttribute("postList", postList);
		return "list";
	}
	
	@RequestMapping(value="/post/{pageNo}")
	public String pageView(@PathVariable("pageNo") Integer pageNo, Model model){
		Post postData = postDao.getOne(pageNo);
		model.addAttribute("postData", postData);
		return "view";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String writeForm(Model model){
		model.addAttribute("formData", new Post());
		return "form";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(Post postData){
		postData = postDao.save(postData);
		return "redirect:/post/" + postData.getBoardId();
	}
}
