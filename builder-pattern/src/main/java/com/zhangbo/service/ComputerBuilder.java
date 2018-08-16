package com.zhangbo.service;

import com.zhangbo.entity.Computer;

/**
 * 电脑部件组装的过程
 */
public abstract class ComputerBuilder {

	/**
	 * 组装CPU
	 */
	public abstract void buildCpu();

	/**
	 * 组装主板
	 */
	public abstract void buildMotherBoard();

	/**
	 * 组装内存
	 */
	public abstract void buildMemory();

	/**
	 * 获取组装完成的电脑
	 *
	 * @return
	 */
	public abstract Computer getComputer();

}
