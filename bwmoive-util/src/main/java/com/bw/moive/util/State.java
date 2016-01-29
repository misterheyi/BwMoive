package com.bw.moive.util;

public class State {

	private Integer code;

	private String desc;

	public State(Integer code, String desc) {
		super();
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
