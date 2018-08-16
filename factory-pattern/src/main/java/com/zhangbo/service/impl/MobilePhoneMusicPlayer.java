package com.zhangbo.service.impl;

import com.zhangbo.service.MusicPlayer;

/**
 * 手机播放器
 */
public class MobilePhoneMusicPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("通过手机播放了一首歌曲");
	}
}
