package com.zhangbo.proxy.statics;

/**
 * 操作代理对象，在每次操作前后打印日志
 */
public class OperateDaoProxy implements OperateDao {

	private OperateDao operateDao;

	public OperateDaoProxy(OperateDao operateDao) {
		this.operateDao = operateDao;
	}

	@Override
	public void add() {
		System.out.println("*****增加前*****");
		operateDao.add();
		System.out.println("*****增加后*****");
	}

	@Override
	public void update() {
		System.out.println("*****更新前*****");
		operateDao.update();
		System.out.println("*****更新后*****");
	}

	@Override
	public void delete() {
		System.out.println("*****删除前*****");
		operateDao.delete();
		System.out.println("*****删除后*****");
	}

	@Override
	public void find() {
		System.out.println("*****查找前*****");
		operateDao.find();
		System.out.println("*****查找后*****");
	}
}
