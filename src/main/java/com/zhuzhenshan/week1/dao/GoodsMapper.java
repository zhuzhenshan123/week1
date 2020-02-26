package com.zhuzhenshan.week1.dao;

import java.util.List;

import com.zhuzhenshan.week1.entity.Condition;
import com.zhuzhenshan.week1.entity.Goods;
import com.zhuzhenshan.week1.entity.GoodsBrand;
import com.zhuzhenshan.week1.entity.GoodsType;

public interface GoodsMapper {

	List<Goods> list(Condition con);
	List<GoodsBrand> findByBid(Integer bid);
	List<GoodsType> findByTid(Integer tid);
	void add(Goods goods);
	
	
}
