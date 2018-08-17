package com.zhangbo.proxy.cglib;

/**
 * 操作实现类
 */
public class OperateDaoImpl implements OperateDao {

	@Override
	public void add() {
		System.out.println("增加一条记录");
	}

	@Override
	public void update() {
		System.out.println("更新一条记录");
	}

	@Override
	public void delete() {
		System.out.println("删除一条记录");
	}

	@Override
	public void find() {
		System.out.println("查找一条记录");
	}
}
