package com.zhangbo.observer;

/**
 * 公众号用户B
 */
public class UserB implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("用户B收到消息：" + msg);
	}

}
