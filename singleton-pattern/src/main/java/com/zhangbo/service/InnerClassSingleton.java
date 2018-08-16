package com.zhangbo.service;

/**
 * 懒汉式+登记式/静态内部类
 * <p>
 * 线程安全，支持多线程。
 * <p>
 * 通过内部类延迟实例化对象。
 */
public class InnerClassSingleton {

	private static class InnerClassSingletonHolder {

		private static final InnerClassSingleton singleton = new InnerClassSingleton();

	}

	private InnerClassSingleton() {

	}

	public static InnerClassSingleton getInstance() {
		return InnerClassSingletonHolder.singleton;
	}

}
