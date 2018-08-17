package com.zhangbo.decorator;

/**
 * 鱼火锅装饰器
 */
public abstract class FishHotPotDecorator implements HotPot {

	private HotPot hotPot;

	public FishHotPotDecorator(HotPot hotPot) {
		this.hotPot = hotPot;
	}

	@Override
	public void init() {
		hotPot.init();
	}
}
