package com.zhangbo;

import com.zhangbo.decorator.DouFuFishHotPotDecorator;
import com.zhangbo.decorator.FishHotPot;
import com.zhangbo.decorator.HotPot;
import com.zhangbo.decorator.PotatoFishHotPotDecorator;

/**
 * 装饰器模式
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {

		//1、鱼+底料
		HotPot level1 = new FishHotPot();

		level1.init();

		System.out.println("*******************");

		//2、加入豆腐
		HotPot level2 = new DouFuFishHotPotDecorator(level1);

		level2.init();

		System.out.println("*******************");

		//3、加入土豆
		HotPot level3 = new PotatoFishHotPotDecorator(level2);

		level3.init();

		System.out.println("*******************");

		//4、一步到位
		HotPot hotPot2 = new FishHotPot();

		HotPot level4 = new DouFuFishHotPotDecorator(new PotatoFishHotPotDecorator(hotPot2));

		level4.init();

	}

}
