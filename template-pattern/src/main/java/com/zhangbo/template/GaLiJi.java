package com.zhangbo.template;

/**
 * 咖喱鸡
 */
public class GaLiJi extends CookTemplate {

	public GaLiJi(String name) {
		super(name);
	}

	@Override
	void wash() {
		System.out.println("杀鸡，宰鸡，洗鸡，剁鸡");
	}

	@Override
	void start() {
		System.out.println("鸡块过热水");
		System.out.println("起锅烧油放土豆放鸡块放青椒放咖喱放调料");
		System.out.println("翻炒");
		System.out.println("感觉熟了就出锅");
	}
}
