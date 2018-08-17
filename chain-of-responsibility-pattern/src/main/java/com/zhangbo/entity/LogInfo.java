package com.zhangbo.entity;

/**
 * 日志信息
 */
public class LogInfo {

	//日志等级
	private int level;

	//日志信息
	private String msg;

	public LogInfo(int level, String msg) {
		this.level = level;
		this.msg = msg;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
