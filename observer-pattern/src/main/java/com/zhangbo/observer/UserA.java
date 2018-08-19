package com.zhangbo.observer;

/**
 * 公众号用户A
 */
public class UserA implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("用户A收到消息：" + msg);
	}
}
