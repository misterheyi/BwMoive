package com.bw.moive.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Link implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7302125040487060990L;
	//编号
	private String id;
	//所属电影ID
	private String mid;
	//名称
	private String name;
	//链接
	private String link;
	//链接类型
	private Integer linkType;
	//创建者
	private String creator;
	//创建时间
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getLinkType() {
		return linkType;
	}

	public void setLinkType(Integer linkType) {
		this.linkType = linkType;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
}
