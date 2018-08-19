package com.zhangbo;

import com.zhangbo.observer.UserA;
import com.zhangbo.observer.UserB;
import com.zhangbo.observer.WeChatSubject;

/**
 * 设计模式-观察者模式
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		//1、创建微信公众号
		WeChatSubject subject = new WeChatSubject();

		//2、创建公众号用户
		UserA userA = new UserA();
		UserB userB = new UserB();

		//3、用户关注公众号
		subject.registerObserver(userA);
		subject.registerObserver(userB);

		//4、推送一条消息
		subject.publishMessage("Hello world!");

		//5、用户A取消关注
		subject.removeObserver(userA);

		//6、推送一条消息
		subject.publishMessage("Are you ok?");

	}

}
