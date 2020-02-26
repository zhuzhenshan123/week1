package com.zhuzhenshan.week1.entity;

public class GoodsBrand {
	private Integer bid;
	private String brand;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public GoodsBrand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsBrand(Integer bid, String brand) {
		super();
		this.bid = bid;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "GoodsBrand [bid=" + bid + ", brand=" + brand + "]";
	}
	
}
