package com.zhangbo.factory;

import com.sun.tools.javac.util.Assert;
import com.zhangbo.enums.MusicTypeEnum;
import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;
import com.zhangbo.service.impl.ClassicalMusic;
import com.zhangbo.service.impl.JazzMusic;
import com.zhangbo.service.impl.PopMusic;

/**
 * 音乐工厂
 */
public class MusicFactory extends AbstractFactory {

	@Override
	public MusicPlayer getMusicPlayer(String playerName) {
		return null;
	}

	/**
	 * 根据音乐类型，生成对应的音乐
	 *
	 * @param musicCode
	 * @return
	 */
	@Override
	public Music getMusic(String musicCode) {
		Assert.checkNonNull(musicCode);

		if (MusicTypeEnum.CLASSICAL.getCode().equals(musicCode)) {
			return new ClassicalMusic();
		} else if (MusicTypeEnum.JAZZ.getCode().equals(musicCode)) {
			return new JazzMusic();
		} else if (MusicTypeEnum.POP.getCode().equals(musicCode)) {
			return new PopMusic();
		}

		return null;
	}
}
