package com.zhangbo.enums;

/**
 * 音乐类型枚举类
 */
public enum MusicTypeEnum {

	CLASSICAL("古典乐", "CLASSICAL"),
	POP("流行乐", "POP"),
	JAZZ("爵士乐", "JAZZ");

	String type;
	String code;

	MusicTypeEnum(String type, String code) {
		this.type = type;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
