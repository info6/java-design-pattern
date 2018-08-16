package com.zhangbo.entity;

/**
 * 主板
 */
public class MotherBoard extends ComputerComponent {

	public MotherBoard(String name, float price) {
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
