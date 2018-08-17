package com.zhangbo.proxy;

import com.zhangbo.proxy.cglib.CglibProxy;
import com.zhangbo.proxy.cglib.OperateDao;
import com.zhangbo.proxy.cglib.OperateDaoImpl;

/**
 * 代理模式-cglib动态代理（类）
 */
public class CglibProxyDemo {

	public static void main(String[] args) {

		//1、创建操作对象
		OperateDao operateDao = new OperateDaoImpl();

		//2、执行对象方法
		operateDao.add();
		operateDao.find();
		operateDao.delete();
		operateDao.update();

		//3、创建代理对象
		CglibProxy cglibProxy = new CglibProxy();

		//4、获取实例
		OperateDao operateDaoProxy = (OperateDaoImpl) cglibProxy.getInstance(operateDao);

		//5、执行代理对象方法
		operateDaoProxy.add();
		operateDaoProxy.find();
		operateDaoProxy.delete();
		operateDaoProxy.update();

	}

}
