package com.bw.moive.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 下载链接
 * @author heyi
 */
public class Link implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6599445124396048994L;

	//ID
	private Integer lId;
	
	//电影ID
	private Integer vId;
	
	//名称
	private String lName;
	
	//链接地址(原始地址)
	private String lLink;
	
	//链接地址类型
	private Integer lType;
	
	//状态（0:正常）
	private Integer lStatus;
	
	//创建时间
	private Date lCreateTime;

	//更新时间
	private Date lUpdateTime;

	public Integer getlId() {
		return lId;
	}

	public void setlId(Integer lId) {
		this.lId = lId;
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getlLink() {
		return lLink;
	}

	public void setlLink(String lLink) {
		this.lLink = lLink;
	}

	public Integer getlType() {
		return lType;
	}

	public void setlType(Integer lType) {
		this.lType = lType;
	}

	public Integer getlStatus() {
		return lStatus;
	}

	public void setlStatus(Integer lStatus) {
		this.lStatus = lStatus;
	}

	public Date getlCreateTime() {
		return lCreateTime;
	}

	public void setlCreateTime(Date lCreateTime) {
		this.lCreateTime = lCreateTime;
	}

	public Date getlUpdateTime() {
		return lUpdateTime;
	}

	public void setlUpdateTime(Date lUpdateTime) {
		this.lUpdateTime = lUpdateTime;
	}
	

}
