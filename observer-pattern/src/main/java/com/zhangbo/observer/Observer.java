package com.zhangbo.observer;

/**
 * 观察者
 */
public interface Observer {

	/**
	 * 当被观察者消息更新时，执行观察者的方法
	 **/
	void update(String msg);

}
