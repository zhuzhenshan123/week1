package com.zhuzhenshan.week1.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuzhenshan.week1.entity.Condition;
import com.zhuzhenshan.week1.entity.Goods;
import com.zhuzhenshan.week1.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m,Condition con) {
		if(con.getPageNum()==null||"".equals(con.getPageNum())) {
			con.setPageNum(1);
		}
		PageHelper.startPage(con.getPageNum(), 3);
		List<Goods> list =service.list(con);
		
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("con", con);
		return "list";
	}
	@RequestMapping("toAdd")
	public String toAdd(Model m,Goods goods) {
		m.addAttribute("goods", goods);
		return "add";
	}
	
	@RequestMapping("add")
	
	public String add(Model m,@Validated @ModelAttribute Goods goods,MultipartFile myFile,HttpServletRequest request) throws IllegalStateException, IOException {
		
		/*
		 * if(!myFile.isEmpty()) { String realPath = request.getRealPath("/file/");
		 * String end =
		 * myFile.getOriginalFilename().substring(myFile.getOriginalFilename().
		 * lastIndexOf(".")); String start = UUID.randomUUID().toString(); File file =
		 * new File(realPath+start+end); myFile.transferTo(file);
		 * goods.setPic(start+end); }
		 */
		
		
		service.add(goods);
		return "list";
	}
	
}
