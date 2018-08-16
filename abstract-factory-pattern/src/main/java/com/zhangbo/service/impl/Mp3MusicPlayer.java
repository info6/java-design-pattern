package com.zhangbo.service.impl;

import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;

/**
 * mp3播放器
 */
public class Mp3MusicPlayer implements MusicPlayer {

	@Override
	public void play(Music music) {
		System.out.println("通过[mp3]播放了一首[" + music.getMusic() + "]");
	}

}
