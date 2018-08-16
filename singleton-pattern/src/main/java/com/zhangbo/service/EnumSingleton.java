package com.zhangbo.service;

/**
 * 饿汉式
 * <p>
 * 线程安全，支持多线程。
 * <p>
 * 采用枚举类实现
 */
public enum EnumSingleton {

	INSTANCE();

	public void method() {

	}

}
