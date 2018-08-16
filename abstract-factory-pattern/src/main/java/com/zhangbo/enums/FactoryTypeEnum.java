package com.zhangbo.enums;

/**
 * 工厂类型枚举类
 */
public enum FactoryTypeEnum {

	PALYER("播放器", "CLASSICAL"),
	MUSIC("音乐", "POP");

	String type;
	String code;

	FactoryTypeEnum(String type, String code) {
		this.type = type;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
