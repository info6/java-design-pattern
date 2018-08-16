package com.zhangbo.service;

/**
 * 懒汉式写法
 * <p>
 * 线程安全
 * <p>
 * 懒加载节省内存，但synchronized影响性能
 */
public class LazySafeSingleton {

	private static LazySafeSingleton singleton;

	private LazySafeSingleton() {
	}

	public static synchronized LazySafeSingleton getInstance() {
		if (singleton == null) {
			singleton = new LazySafeSingleton();
		}
		return singleton;
	}

}
