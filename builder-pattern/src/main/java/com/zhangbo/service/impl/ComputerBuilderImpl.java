package com.zhangbo.service.impl;

import com.zhangbo.entity.CPU;
import com.zhangbo.entity.Computer;
import com.zhangbo.entity.Memory;
import com.zhangbo.entity.MotherBoard;
import com.zhangbo.service.ComputerBuilder;

/**
 * 电脑各部件实际组装过程
 */
public class ComputerBuilderImpl extends ComputerBuilder {

	private Computer computer = new Computer();

	@Override
	public void buildCpu() {
		System.out.println("CPU组装完成");
		computer.add(new CPU("Intel Core I7", 1800));
	}

	@Override
	public void buildMotherBoard() {
		System.out.println("主板组装完成");
		computer.add(new MotherBoard("华硕B360M", 800));
	}

	@Override
	public void buildMemory() {
		System.out.println("内存条组装完成");
		computer.add(new Memory("金士顿骇客神条8G", 599));
	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}
