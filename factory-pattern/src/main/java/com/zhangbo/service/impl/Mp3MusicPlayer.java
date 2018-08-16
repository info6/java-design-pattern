package com.zhangbo.service.impl;

import com.zhangbo.service.MusicPlayer;

/**
 * mp3播放器
 */
public class Mp3MusicPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("通过mp3播放了一首歌曲");
	}

}
