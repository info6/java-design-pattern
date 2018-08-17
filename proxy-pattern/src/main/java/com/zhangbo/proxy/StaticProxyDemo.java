package com.zhangbo.proxy;

import com.zhangbo.proxy.statics.OperateDao;
import com.zhangbo.proxy.statics.OperateDaoImpl;
import com.zhangbo.proxy.statics.OperateDaoProxy;

/**
 * 代理模式-静态代理
 */
public class StaticProxyDemo {

	public static void main(String[] args) {

		//1、创建操作对象
		OperateDao operateDao = new OperateDaoImpl();

		//2、执行操作对象的方法
		operateDao.add();
		operateDao.find();
		operateDao.delete();
		operateDao.update();

		//3、创建代理对象
		OperateDao operateDaoProxy = new OperateDaoProxy(operateDao);

		//4、执行操作代理对象的方法
		operateDaoProxy.add();
		operateDaoProxy.find();
		operateDaoProxy.delete();
		operateDaoProxy.update();

	}

}
