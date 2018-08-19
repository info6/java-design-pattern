package com.zhangbo.strategy;

/**
 * 手机播放器
 */
public class PhonePlayer implements MusicPlayer {

	@Override
	public void play(String music) {
		System.out.println("手机播放一首歌曲：" + music);
	}
}
