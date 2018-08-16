package com.zhangbo;

import com.zhangbo.service.ComputerBuilder;
import com.zhangbo.service.impl.ComputerBuilderImpl;
import com.zhangbo.entity.Computer;
import com.zhangbo.producer.ComputerProducer;

/**
 * 建造者模式
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		//1、初始化电脑部件组件的过程细节
		ComputerBuilder computerBuilder = new ComputerBuilderImpl();

		//2、初始化一个组装工人，并传入组装过程
		ComputerProducer producer = new ComputerProducer(computerBuilder);

		//3、开始组装，并返回组装好的电脑
		Computer computer = producer.produceComputer();

		//4、显示电脑价钱明细
		computer.price();

	}
}
