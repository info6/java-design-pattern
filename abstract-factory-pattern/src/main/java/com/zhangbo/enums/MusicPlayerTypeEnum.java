package com.zhangbo.enums;

/**
 * 播放器类型枚举类
 */
public enum MusicPlayerTypeEnum {

	MP3("mp3播放器", "MP3"),
	COMPUTER("电脑播放器", "COMPUTER"),
	MOBILE_PHONE("手机播放器", "MOBILE_PHONE");

	String type;
	String name;

	MusicPlayerTypeEnum(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
