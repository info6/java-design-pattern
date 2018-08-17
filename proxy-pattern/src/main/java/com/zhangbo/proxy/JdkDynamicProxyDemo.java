package com.zhangbo.proxy;

import com.zhangbo.proxy.jdk.JdkDynamicProxy;
import com.zhangbo.proxy.jdk.OperateDao;
import com.zhangbo.proxy.jdk.OperateDaoImpl;

import java.lang.reflect.Proxy;

/**
 * 代理模式-动态代理
 */
public class JdkDynamicProxyDemo {

	public static void main(String[] args) {
		//1、创建操作对象
		OperateDao operateDao = new OperateDaoImpl();

		//2、执行对象方法
		operateDao.add();
		operateDao.find();
		operateDao.delete();
		operateDao.update();

		//3、创建代理对象
		OperateDao operateDaoProxy =
				(OperateDao) Proxy.newProxyInstance(OperateDao.class.getClassLoader(), new Class[]{OperateDao.class},
													new JdkDynamicProxy(operateDao));
		//4、执行代理对象方法
		operateDaoProxy.add();
		operateDaoProxy.find();
		operateDaoProxy.delete();
		operateDaoProxy.update();

	}

}
