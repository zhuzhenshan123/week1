package com.zhuzhenshan.week1.entity;

import java.util.List;



public class Goods {
	private Integer gid;
	private String gname;
	private String ename;
	private Double gsize;
	private Double price;
	
	private Integer num;
	private String biao;
	private String pic;
	private Integer tid;
	private Integer bid;
	
	private List<GoodsBrand> gbs;
	private List<GoodsType> gts;
	
	
	
	public List<GoodsBrand> getGbs() {
		return gbs;
	}
	public void setGbs(List<GoodsBrand> gbs) {
		this.gbs = gbs;
	}
	public List<GoodsType> getGts() {
		return gts;
	}
	public void setGts(List<GoodsType> gts) {
		this.gts = gts;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getGsize() {
		return gsize;
	}
	public void setGsize(Double gsize) {
		this.gsize = gsize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBiao() {
		return biao;
	}
	public void setBiao(String biao) {
		this.biao = biao;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
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
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer gid, String gname, String ename, Double gsize, Double price, Integer num, String biao,
			String pic, Integer tid, Integer bid, List<GoodsBrand> gbs, List<GoodsType> gts) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.gsize = gsize;
		this.price = price;
		this.num = num;
		this.biao = biao;
		this.pic = pic;
		this.tid = tid;
		this.bid = bid;
		this.gbs = gbs;
		this.gts = gts;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ename=" + ename + ", gsize=" + gsize + ", price=" + price
				+ ", num=" + num + ", biao=" + biao + ", pic=" + pic + ", tid=" + tid + ", bid=" + bid + ", gbs=" + gbs
				+ ", gts=" + gts + "]";
	}
	
	
	
	
}
