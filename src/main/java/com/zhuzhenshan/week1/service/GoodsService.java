package com.zhuzhenshan.week1.service;

import java.util.List;

import com.zhuzhenshan.week1.entity.Condition;
import com.zhuzhenshan.week1.entity.Goods;

public interface GoodsService {

	List<Goods> list(Condition con);

	void add(Goods goods);

}
