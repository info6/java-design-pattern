package com.zhangbo.template;

/**
 * 炒青菜
 */
public class QingCai extends CookTemplate {

	public QingCai(String name) {
		super(name);
	}

	@Override
	void wash() {
		System.out.println(name + "去根，去烂叶，洗净");
	}

	@Override
	void start() {
		System.out.println("起锅烧油");
		System.out.println("放入" + name + "加调料");
		System.out.println("出锅");
	}
}
