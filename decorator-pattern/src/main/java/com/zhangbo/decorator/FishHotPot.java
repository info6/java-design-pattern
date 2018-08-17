package com.zhangbo.decorator;

/**
 * 火锅
 */
public class FishHotPot implements HotPot {

	@Override
	public void init() {
		System.out.println("初始鱼火锅配置： 鱼+底料");
	}
}
