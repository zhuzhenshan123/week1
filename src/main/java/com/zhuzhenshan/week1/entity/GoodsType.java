package com.zhuzhenshan.week1.entity;

public class GoodsType {
	private Integer tid;
	private String type;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsType(Integer tid, String type) {
		super();
		this.tid = tid;
		this.type = type;
	}
	@Override
	public String toString() {
		return "GoodsType [tid=" + tid + ", type=" + type + "]";
	}
	
	
}
