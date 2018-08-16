package com.zhangbo.entity;

/**
 * CPU
 */
public class CPU extends ComputerComponent {

	public CPU(String name, float price) {
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
