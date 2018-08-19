package com.zhangbo;

import com.zhangbo.strategy.Mp3Player;
import com.zhangbo.strategy.MusicContext;
import com.zhangbo.strategy.PhonePlayer;

/**
 * 设计模式-策略模式
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {

		//1、使用mp3播放一首歌曲
		MusicContext mp3PlayerContext = new MusicContext(new Mp3Player());

		mp3PlayerContext.play("东风破");

		//2、使用手机播放一首歌曲
		MusicContext phonePlayerContext = new MusicContext(new PhonePlayer());

		phonePlayerContext.play("菊花残");

	}

}
