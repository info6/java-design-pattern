package com.zhangbo.template;

/**
 * 做菜
 */
public abstract class CookTemplate {

	//菜名
	protected String name;

	public CookTemplate(String name) {
		this.name = name;
	}

	/**
	 * 买菜
	 */
	protected void buy() {
		System.out.println("去菜市场买[" + name + "]");
	}

	/**
	 * 洗菜
	 */
	abstract void wash();

	/**
	 * 做菜
	 */
	abstract void start();

	/**
	 * 做菜流程
	 */
	public void process() {
		buy();
		wash();
		start();
	}

}
