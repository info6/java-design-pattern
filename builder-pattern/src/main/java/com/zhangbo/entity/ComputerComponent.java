package com.zhangbo.entity;

/**
 * 电脑组件
 */
public abstract class ComputerComponent {

	protected String name;

	protected float price;

	protected abstract String getName();

	protected abstract float getPrice();

}
