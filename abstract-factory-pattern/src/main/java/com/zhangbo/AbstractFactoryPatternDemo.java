package com.zhangbo;

import com.zhangbo.enums.FactoryTypeEnum;
import com.zhangbo.enums.MusicPlayerTypeEnum;
import com.zhangbo.enums.MusicTypeEnum;
import com.zhangbo.factory.AbstractFactory;
import com.zhangbo.factory.MediaFactory;
import com.zhangbo.service.Music;
import com.zhangbo.service.MusicPlayer;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		//1、获取一个音乐工厂
		AbstractFactory musicFactory = MediaFactory.getFactory(FactoryTypeEnum.MUSIC.getCode());

		//2、获取一个播放器工厂
		AbstractFactory playerFactory = MediaFactory.getFactory(FactoryTypeEnum.PALYER.getCode());

		//3、通过音乐工厂获取一首古典乐
		Music classicalMusic = musicFactory.getMusic(MusicTypeEnum.CLASSICAL.getCode());

		//4、通过播放器工厂获取一个mp3播放器
		MusicPlayer mp3Player = playerFactory.getMusicPlayer(MusicPlayerTypeEnum.MP3.getName());

		//5、使用mp3播放一首古典乐
		mp3Player.play(classicalMusic);

		//6、通过音乐工厂获取一首流行乐
		Music popMusic = musicFactory.getMusic(MusicTypeEnum.POP.getCode());

		//7、通过播放器工厂获取一个电脑播放器
		MusicPlayer computerPlayer = playerFactory.getMusicPlayer(MusicPlayerTypeEnum.COMPUTER.getName());

		//8、使用电脑播放器播放一首流行乐
		computerPlayer.play(popMusic);

		//9、通过音乐工厂获取一首流行乐
		Music jazzMusic = musicFactory.getMusic(MusicTypeEnum.JAZZ.getCode());

		//10、通过播放器工厂获取一个手机播放器
		MusicPlayer phonePlayer = playerFactory.getMusicPlayer(MusicPlayerTypeEnum.MOBILE_PHONE.getName());

		//11、使用手机播放器播放一首爵士乐
		phonePlayer.play(jazzMusic);

	}

}
