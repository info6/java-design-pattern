package com.zhangbo.service;

/**
 * 饿汉式写法
 * <p>
 * 线程安全，支持多线程。
 * <p>
 * 类加载时初始化，浪费内存
 */
public class HungrySingleton {

	private static HungrySingleton singleton = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		return singleton;
	}

}
