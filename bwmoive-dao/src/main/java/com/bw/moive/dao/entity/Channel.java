package com.bw.moive.dao.entity;

import java.io.Serializable;

public class Channel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3540771530177089514L;

	private Integer cId;

	private String cName;

	private String cEnName;

	private String cOrder;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEnName() {
		return cEnName;
	}

	public void setcEnName(String cEnName) {
		this.cEnName = cEnName;
	}

	public String getcOrder() {
		return cOrder;
	}

	public void setcOrder(String cOrder) {
		this.cOrder = cOrder;
	}


}
