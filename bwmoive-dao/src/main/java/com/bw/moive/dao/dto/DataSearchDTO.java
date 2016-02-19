package com.bw.moive.dao.dto;

import java.io.Serializable;

public class DataSearchDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String vName;
	private Integer cId;
	private Integer tId;
	private Integer aId;
	private Integer aYear;
	private Integer page;
	private Integer rows;
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public Integer getaYear() {
		return aYear;
	}
	public void setaYear(Integer aYear) {
		this.aYear = aYear;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}
