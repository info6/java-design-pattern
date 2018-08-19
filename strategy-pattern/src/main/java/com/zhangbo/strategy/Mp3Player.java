package com.zhangbo.strategy;

/**
 * Mp3播放器
 */
public class Mp3Player implements MusicPlayer {

	@Override
	public void play(String music) {
		System.out.println("MP3播放一首歌曲：" + music);
	}
}
