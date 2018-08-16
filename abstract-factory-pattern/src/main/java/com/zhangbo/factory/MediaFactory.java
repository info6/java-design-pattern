package com.zhangbo.factory;

import com.sun.tools.javac.util.Assert;
import com.zhangbo.enums.FactoryTypeEnum;

/**
 * 多媒体播放器
 */
public class MediaFactory {

	/**
	 * 获取工厂
	 *
	 * @param code
	 * @return
	 */
	public static AbstractFactory getFactory(String code) {
		Assert.checkNonNull(code);

		if (FactoryTypeEnum.MUSIC.getCode().equals(code)) {
			return new MusicFactory();
		} else if (FactoryTypeEnum.PALYER.getCode().equals(code)) {
			return new MusicPlayerFactory();
		}

		throw new RuntimeException("错误的工厂类型");
	}

}
