package com.zhangbo.service.impl;

import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;

/**
 * 电脑播放器
 */
public class ComputerMusicPlayer implements MusicPlayer {

	@Override
	public void play(Music music) {
		System.out.println("通过[电脑]播放了一首[" + music.getMusic() + "]");
	}
}
