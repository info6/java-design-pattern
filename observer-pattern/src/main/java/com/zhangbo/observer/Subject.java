package com.zhangbo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public interface Subject {

	/**
	 * 观察者集合
	 */
	List<Observer> observers = new ArrayList<>();

	/**
	 * 注册观察者
	 *
	 * @param observer
	 */
	void registerObserver(Observer observer);

	/**
	 * 移除观察者
	 *
	 * @param observer
	 */
	void removeObserver(Observer observer);

	/**
	 * 通知观察者
	 *
	 * @param msg
	 */
	void notifyObservers(String msg);

}
