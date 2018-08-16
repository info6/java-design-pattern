package com.zhangbo.service.impl;

import com.zhangbo.service.MusicPlayer;

/**
 * 电脑播放器
 */
public class ComputerMusicPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("通过电脑播放了一首歌曲");
	}
}
