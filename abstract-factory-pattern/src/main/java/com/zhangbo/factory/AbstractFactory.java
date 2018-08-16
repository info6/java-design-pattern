package com.zhangbo.factory;

import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

	/**
	 * 获取音乐播放器
	 *
	 * @param playerName
	 * @return
	 */
	public abstract MusicPlayer getMusicPlayer(String playerName);

	/**
	 * 获取音乐类型
	 * @param musicType
	 * @return
	 */
	public abstract Music getMusic(String musicType);


}
