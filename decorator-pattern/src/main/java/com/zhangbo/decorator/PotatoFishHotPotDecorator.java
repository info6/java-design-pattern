package com.zhangbo.decorator;

/**
 * 土豆装饰器
 */
public class PotatoFishHotPotDecorator extends FishHotPotDecorator {

	public PotatoFishHotPotDecorator(HotPot hotPot) {
		super(hotPot);
	}

	@Override
	public void init() {
		super.init();
		potato();
	}

	private void potato() {
		System.out.println("加入土豆");
	}
}
