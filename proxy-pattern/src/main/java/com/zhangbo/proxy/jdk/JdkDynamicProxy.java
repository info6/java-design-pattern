package com.zhangbo.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理（代理类必须有接口）
 */
public class JdkDynamicProxy implements InvocationHandler {

	private Object object;

	public JdkDynamicProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("*****" + method.getName() + "前*****");
		Object result = method.invoke(object, args);
		System.out.println("*****" + method.getName() + "后*****");
		return result;
	}
}
