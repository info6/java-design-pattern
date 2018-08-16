package com.zhangbo.factory;

import com.sun.tools.javac.util.Assert;
import com.zhangbo.enums.MusicPlayerTypeEnum;
import com.zhangbo.service.MusicPlayer;
import com.zhangbo.service.impl.ComputerMusicPlayer;
import com.zhangbo.service.impl.MobilePhoneMusicPlayer;
import com.zhangbo.service.impl.Mp3MusicPlayer;

/**
 * 音乐播放器工厂类
 */
public class MusicPlayerFactory {

	/**
	 * 获取音乐播放器
	 *
	 * @param name
	 * @return
	 */
	public MusicPlayer getMusicPlayer(String name) {
		Assert.checkNonNull(name);

		if (MusicPlayerTypeEnum.MP3.getName().equals(name)) {
			return new Mp3MusicPlayer();
		} else if (MusicPlayerTypeEnum.COMPUTER.getName().equals(name)) {
			return new ComputerMusicPlayer();
		} else if (MusicPlayerTypeEnum.MOBILE_PHONE.getName().equals(name)) {
			return new MobilePhoneMusicPlayer();
		}

		throw new RuntimeException("错误的播放器类型");
	}

}
