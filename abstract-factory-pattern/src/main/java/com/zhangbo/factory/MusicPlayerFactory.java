package com.zhangbo.factory;

import com.sun.tools.javac.util.Assert;
import com.zhangbo.enums.MusicPlayerTypeEnum;
import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;
import com.zhangbo.service.impl.ComputerMusicPlayer;
import com.zhangbo.service.impl.MobilePhoneMusicPlayer;
import com.zhangbo.service.impl.Mp3MusicPlayer;

/**
 * 音乐播放器工厂类
 */
public class MusicPlayerFactory extends AbstractFactory {

	/**
	 * 根据播放器类型，生成对应的音乐播放器
	 *
	 * @param playerName
	 * @return
	 */
	public MusicPlayer getMusicPlayer(String playerName) {
		Assert.checkNonNull(playerName);

		if (MusicPlayerTypeEnum.MP3.getName().equals(playerName)) {
			return new Mp3MusicPlayer();
		} else if (MusicPlayerTypeEnum.COMPUTER.getName().equals(playerName)) {
			return new ComputerMusicPlayer();
		} else if (MusicPlayerTypeEnum.MOBILE_PHONE.getName().equals(playerName)) {
			return new MobilePhoneMusicPlayer();
		}

		throw new RuntimeException("错误的播放器类型");
	}

	@Override
	public Music getMusic(String musicType) {
		return null;
	}

}
