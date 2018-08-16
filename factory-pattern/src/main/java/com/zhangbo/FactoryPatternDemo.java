package com.zhangbo;

import com.zhangbo.enums.MusicPlayerTypeEnum;
import com.zhangbo.factory.MusicPlayerFactory;
import com.zhangbo.service.MusicPlayer;

/**
 * 工厂模式
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {

		//1、初始化音乐播放器工厂类
		MusicPlayerFactory musicPlayerFactory = new MusicPlayerFactory();

		//2、通过工厂创建一个mp3播放器
		MusicPlayer mp3Player = musicPlayerFactory.getMusicPlayer(MusicPlayerTypeEnum.MP3.getName());

		mp3Player.play();

		//3、通过工厂创建一个电脑播放器
		MusicPlayer computerPlayer = musicPlayerFactory.getMusicPlayer(MusicPlayerTypeEnum.COMPUTER.getName());

		computerPlayer.play();

		//4、通过工厂创建一个手机播放器
		MusicPlayer mobilePhonePlayer = musicPlayerFactory.getMusicPlayer(MusicPlayerTypeEnum.MOBILE_PHONE.getName());

		mobilePhonePlayer.play();

	}
}
