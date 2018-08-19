package com.zhangbo.observer;

/**
 * 微信公众号
 */
public class WeChatSubject implements Subject {

	/**
	 * 发布消息
	 *
	 * @param msg
	 */
	public void publishMessage(String msg) {
		System.out.println("微信公众号推送消息：" + msg);
		System.out.println("开始推送给关注用户");
		notifyObservers(msg);
	}

	@Override
	public void registerObserver(Observer observer) {
		System.out.println("用户关注");
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		System.out.println("用户取消关注");
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String msg) {
		observers.forEach(e -> e.update(msg));
	}
}
