package com.zhangbo.service.clazzadapter;

/**
 *
 */
public class Adapter implements Hdmi {

	private Typec typec;

	public Adapter(Typec typec) {
		this.typec = typec;
	}

	@Override
	public void connection() {
		typec.connection();
		System.out.println("typec转换为hdmi");
	}
}
