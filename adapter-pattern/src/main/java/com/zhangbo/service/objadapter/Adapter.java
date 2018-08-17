package com.zhangbo.service.objadapter;

/**
 * 适配器
 */
public class Adapter extends Typec implements Hdmi {

	@Override
	public void connection() {
		super.connection();
		System.out.println("将typec转换为hdmi");
	}
}
