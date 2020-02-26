package com.zhuzhenshan.week1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuzhenshan.week1.dao.GoodsMapper;
import com.zhuzhenshan.week1.entity.Condition;
import com.zhuzhenshan.week1.entity.Goods;
import com.zhuzhenshan.week1.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper mapper;

	@Override
	public List<Goods> list(Condition con) {
		// TODO Auto-generated method stub
		return mapper.list(con);
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		mapper.add(goods);
	}
	
}
