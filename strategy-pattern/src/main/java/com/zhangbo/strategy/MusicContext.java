package com.zhangbo.strategy;

/**
 * 音乐播放类
 */
public class MusicContext {

	private MusicPlayer musicPlayer;

	public MusicContext(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public void play(String music) {
		musicPlayer.play(music);
	}
}
