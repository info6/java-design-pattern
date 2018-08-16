package com.zhangbo.producer;

import com.zhangbo.service.ComputerBuilder;
import com.zhangbo.entity.Computer;

/**
 * 电脑组装工人
 */
public class ComputerProducer {

	private ComputerBuilder computerBuilder;

	public ComputerProducer(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}

	/**
	 * 按照步骤组装电脑
	 *
	 * @return
	 */
	public Computer produceComputer() {
		computerBuilder.buildCpu();
		computerBuilder.buildMemory();
		computerBuilder.buildMotherBoard();
		return computerBuilder.getComputer();
	}

}
