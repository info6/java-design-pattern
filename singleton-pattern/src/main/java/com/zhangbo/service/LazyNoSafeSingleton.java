package com.zhangbo.service;

/**
 * 懒汉式写法
 * <p>
 * 线程不安全，不支持多线程
 */
public class LazyNoSafeSingleton {

	private static LazyNoSafeSingleton singleton;

	private LazyNoSafeSingleton() {
	}

	public static LazyNoSafeSingleton getInstance() {
		if (singleton == null) {
			singleton = new LazyNoSafeSingleton();
		}
		return singleton;
	}

}
