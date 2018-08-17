package com.zhangbo.decorator;

/**
 * 豆腐装饰器
 */
public class DouFuFishHotPotDecorator extends FishHotPotDecorator {

	public DouFuFishHotPotDecorator(HotPot hotPot) {
		super(hotPot);
	}

	@Override
	public void init() {
		super.init();
		doufu();
	}

	private void doufu() {
		System.out.println("加入豆腐");
	}
}
