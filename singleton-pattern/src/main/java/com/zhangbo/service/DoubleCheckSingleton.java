package com.zhangbo.service;

/**
 * 懒汉式+双检锁/双重校验锁
 * <p>
 * 线程安全，支持多线程且保持较高性能
 */
public class DoubleCheckSingleton {

	private static volatile DoubleCheckSingleton singleton;

	private DoubleCheckSingleton() {

	}

	public static DoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
		}
		return singleton;
	}

}
