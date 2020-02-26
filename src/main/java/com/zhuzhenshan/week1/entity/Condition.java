package com.zhuzhenshan.week1.entity;

public class Condition {
	private Integer pageNum;//分页
	private Integer tid;//种类
	private Integer bid;//品牌
	private Double p1;//单价范围1
	private Double p2;//单价范围2
	private String gname;//商品名称
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Condition(Integer pageNum, Integer tid, Integer bid, Double p1, Double p2, String gname) {
		super();
		this.pageNum = pageNum;
		this.tid = tid;
		this.bid = bid;
		this.p1 = p1;
		this.p2 = p2;
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", tid=" + tid + ", bid=" + bid + ", p1=" + p1 + ", p2=" + p2
				+ ", gname=" + gname + "]";
	}
	
	
}
