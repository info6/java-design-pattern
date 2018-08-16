package com.zhangbo.entity;

/**
 * 内存
 */
public class Memory extends ComputerComponent {

	public Memory(String name, float price) {
		this.name = name;
		this.price = price;
	}

	@Override
	protected String getName() {
		return name;
	}

	@Override
	protected float getPrice() {
		return price;
	}
}
