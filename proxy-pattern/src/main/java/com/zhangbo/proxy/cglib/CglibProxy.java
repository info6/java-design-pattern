package com.zhangbo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理（可以代理类）
 */
public class CglibProxy implements MethodInterceptor {

	private Object object;

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("******" + method.getName() + "前******");
		Object result = methodProxy.invoke(object, args);
		System.out.println("******" + method.getName() + "后*****");
		return result;
	}

	/**
	 * 获取代理对象
	 *
	 * @param source
	 * @return
	 */
	public Object getInstance(Object source) {
		this.object = source;
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(this);
		enhancer.setSuperclass(object.getClass());
		return enhancer.create();
	}
}
