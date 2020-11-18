package com.mybatis.po;

public class Orders {
	private int id;
	private String ordersn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrdersn() {
		return ordersn;
	}
	public void setOrdersn(String ordersn) {
		this.ordersn = ordersn;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ",ordersn=" + ordersn+ "]";
	}
}
