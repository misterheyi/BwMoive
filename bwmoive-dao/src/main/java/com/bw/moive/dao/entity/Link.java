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
	private Integer id;
	
	//电影ID
	private Integer mId;
	
	//名称
	private String name;
	
	//链接地址(原始地址)
	private String link;
	
	//链接地址类型
	private Integer type;
	
	//状态（0:正常）
	private Integer status;
	
	//创建者
	private Integer creator;
	
	//创建时间
	private Date createTime;

	//来源
	private String source;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
