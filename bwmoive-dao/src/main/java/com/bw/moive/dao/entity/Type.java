package com.bw.moive.dao.entity;

import java.io.Serializable;
import java.util.List;

public class Type implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3540771530177089514L;

	private Integer tId;

	private Integer upId;

	private String tName;

	private String tEnName;

	private String tOrder;


	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public Integer getUpId() {
		return upId;
	}

	public void setUpId(Integer upId) {
		this.upId = upId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettEnName() {
		return tEnName;
	}

	public void settEnName(String tEnName) {
		this.tEnName = tEnName;
	}

	public String gettOrder() {
		return tOrder;
	}

	public void settOrder(String tOrder) {
		this.tOrder = tOrder;
	}

}
