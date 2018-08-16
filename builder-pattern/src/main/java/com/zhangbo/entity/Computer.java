package com.zhangbo.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑
 */
public class Computer {

	private List<ComputerComponent> computerComponents;

	public Computer() {
		this.computerComponents = new ArrayList<>();
	}

	public void add(ComputerComponent component) {
		computerComponents.add(component);
	}

	public void price() {
		float countPrice = 0;
		for (ComputerComponent comp : computerComponents) {
			System.out.println("配件：" + comp.getName() + "，价格：" + comp.getPrice());
			countPrice += comp.getPrice();
		}
		System.out.println("总价：" + countPrice);
	}

}
