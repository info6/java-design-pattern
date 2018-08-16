package com.zhangbo.service.impl;

import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;

/**
 * 手机播放器
 */
public class MobilePhoneMusicPlayer implements MusicPlayer {

	@Override
	public void play(Music music) {
		System.out.println("通过[手机]播放了一首[" + music.getMusic() + "]");
	}
}
